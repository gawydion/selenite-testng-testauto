package org.selenide.tests;

import com.codeborne.selenide.Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

abstract class BaseTest {
  private static final Logger log = LoggerFactory.getLogger(BaseTest.class);

  @BeforeClass
  final void startTestClass() {
    log.info("Start {} TestNG tests in {}", getClass().getName(), Configuration.browser);
  }

  @AfterClass
  private final void finishTestClass() {
    log.info("Finished {} TestNG tests in {}", getClass().getName(), Configuration.browser);
  }
}
