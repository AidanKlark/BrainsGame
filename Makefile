.DEFAULT_GOAL := build-run

setup:
	./gradlew wrapper --gradle-version 7.1.1

clean:
	./gradlew clean

build: 
	./gradlew clean build

install: clean
	./gradlew install

run-dist:
	./build/install/app/bin/app

run:
	./gradlew run

test:
	./gradlew test

lint:
	./gradlew checkstyleMain checkstyleTest

check-updates:
	./gradlew dependencyUpdates
	
build-run: build run