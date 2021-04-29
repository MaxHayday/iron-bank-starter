package com.maxhayday;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(IronBankStarterConfig.class)
public @interface EnableIronBankStarter {
}
