import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListComponent } from './list/list.component';
import { RegisterComponent } from './register/register.component';


const routes: Routes = [
  { path: '', redirectTo: 'user', pathMatch: 'full' },
  { path: 'user', component: RegisterComponent },
  { path: 'user/list', component: ListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
