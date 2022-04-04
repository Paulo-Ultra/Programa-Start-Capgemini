import { AuthGuard } from './auth.guard';
import { Error404Component } from './error404/error404.component';
import { SobreComponent } from './sobre/sobre.component';
import { InicioComponent } from './inicio/inicio.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'inicio', component: InicioComponent},
  {path:'sobre', component: SobreComponent, canActivate:[AuthGuard]},
  {path:'', redirectTo:'inicio', pathMatch:'full'},
  {path:'**', component: Error404Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
