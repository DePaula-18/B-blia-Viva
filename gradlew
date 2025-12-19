#!/usr/bin/env sh

DIR="$(cd "$(dirname "$0")" && pwd)"
GRADLE_WRAPPER_DIR="$DIR/gradle/wrapper"
GRADLE_WRAPPER_JAR="$GRADLE_WRAPPER_DIR/gradle-wrapper.jar"

if [ ! -f "$GRADLE_WRAPPER_JAR" ]; then
  echo "Gradle wrapper jar not found."
  exit 1
fi

exec java -jar "$GRADLE_WRAPPER_JAR" "$@"
