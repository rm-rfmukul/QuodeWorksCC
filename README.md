# QuodeWorks - TestNG + Maven + Playwright POC

## Stack Used:
- TestNG - Testing Framework
- Maven - Build Tool and Dependency Manager
- Playwright Java - Browser Automation

## What this POC does:
- Opens a Chromium browser.
- Navigates to https://example.com.
- Verifies that the page title is "Example Domain".

## How to Run:
1. mvn clean install
2. The test runs through TestNG using testng.xml file.

## Why this stack:
- TestNG provides easy test organization, reporting.
- Maven handles dependencies automatically.
- Playwright provides fast and reliable browser automation across Chromium, Firefox, and Webkit.
