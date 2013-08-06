#!/bin/sh

curl -v -d @test-data.json -X POST http://localhost:8080/tincan-server/webresources/myresource/post -H "Content-Type: application/json"


