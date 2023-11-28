import { Routes } from '@angular/router';
import { HomeComponent } from './components/pages/home/home.component';
import { MoviesComponent } from './components/pages/movies/movies.component';

export const routes: Routes = [
    {path: '', component: HomeComponent},
    {path: 'movies', component: MoviesComponent}
];