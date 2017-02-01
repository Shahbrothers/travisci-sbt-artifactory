#!/bin/bash


cat <<EOF > credentials.properties
realm=Artifactory Realm
host=jfrog
user=$ARTIFACTORY_USERNAME
password=$ARTIFACTORY_PASSWORD
EOF

echo "Created credentials.properties file: Here it is: "
ls -la credentials.properties
