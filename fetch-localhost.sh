#!/bin/bash

wget \
	--recursive \
	--convert-links \
	--html-extension \
	--page-requisites \
	localhost:8080 \
	localhost:8080/members
