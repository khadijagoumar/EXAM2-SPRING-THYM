import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ClientHomepageComponent } from './client-homepage/client-homepage.component';
import {RouterLink, RouterOutlet} from "@angular/router";
import {AppRoutingModule} from "./app-routing.module";
import { DynamicFormComponent } from './dynamic-form/dynamic-form.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {FactureFormComponent} from "./facture-form/facture-form.component";
import { ConfirmSignatureComponent } from './confirm-signature/confirm-signature.component';

@NgModule({
  declarations: [
    AppComponent,
    ClientHomepageComponent,
    DynamicFormComponent,
    FactureFormComponent,
    ConfirmSignatureComponent,
  ],
  imports: [
    BrowserModule,
    RouterLink,
    HttpClientModule,
    RouterOutlet,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
