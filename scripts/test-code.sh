#!/usr/bin/env bash

# Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>

set -e
set -o pipefail

sbt "++ $TRAVIS_SCALA_VERSION test"          
sbt +publishLocal plugin/test plugin/scripted