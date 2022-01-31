import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AcmeComponent } from './acme/acme.component';
import { HomeComponent } from './home/home.component';
import { ProductComponent } from './product/product.component';

const routes: Routes = [{path:'acme',component:AcmeComponent},
                        {path:'',component:HomeComponent},
                        {path:'product',component:ProductComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
