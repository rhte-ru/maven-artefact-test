package ${package}.model;

import ${package}.common.AbstractDataObject;

import java.util.UUID;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;

@DataObject(generateConverter = true)
public class ${dataObjectClassName} implements AbstractDataObject {

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 1;

    private String id;
    private String name;
    private String otherReference;

    public ${dataObjectClassName}() {
        this.id = defaultId();
        this.name = "default name for: " + id.toString();
        this.otherReference = null;
    }

    public ${dataObjectClassName}(${dataObjectClassName} other) {
        this.id = other.id;
        this.name = other.name;
        this.otherReference = other.otherReference;
    }

    public ${dataObjectClassName}(String id, String name, String ref) {
        this.id = id;
        this.name = name;
        this.otherReference = ref;
    }

    public ${dataObjectClassName}(JsonObject json) {
        SimpleDataObjectConverter.fromJson(json, this);
    }

    public static String defaultId() {
        return UUID.randomUUID().toString();
    }

    public String getId() {
        if (id == null) {
            id = defaultId();
        }
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherReference() {
        return otherReference;
    }

    public void setOtherReference(String otherReference) {
        this.otherReference = otherReference;
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        ${dataObjectClassName}Converter.toJson(this, json);
        return json;
    }

    public String toString() {
        return toStringAbstract();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof ${dataObjectClassName})) {
            return false;
        }
        final ${dataObjectClassName} sdo = (${dataObjectClassName}) o;
        if (getId().equals(sdo.getId()) == false) {
            return false;
        }
        if (getName() != null && getName().equals(sdo.getName()) == false) {
            return false;
        }
        if (getOtherReference() != null && getOtherReference().equals(sdo.getOtherReference()) == false) {
            return false;
        }
        return true;
    }
}
