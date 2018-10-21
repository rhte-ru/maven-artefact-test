# How to use Vert.x booster project for Red Hat Datagrid backend dataservice

```
$ mvn archetype:generate \
    -DarchetypeGroupId=<archetype-groupId> \
    -DarchetypeArtifactId=<archetype-artifactId> \
    -DarchetypeVersion=<archetype-version> \
    -DgroupId=<my.groupid> \
    -DartifactId=<my-artifactId>
$ mvn archetype:generate \
    -DarchetypeGroupId=com.redhat.techexchange.ru.vertx.archetype \
    -DarchetypeArtifactId=datagrid-verticle \
    -DarchetypeVersion=1.0 \
    -DgroupId=com.redhat.vertxdemo \
    -DartifactId=account \
    -Dversion=1.0
    -DdataObjectClassName=SimpleDataObject

```