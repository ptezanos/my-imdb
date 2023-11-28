import { Routes } from '@angular/router';
import { HomeComponent } from './components/pages/home/home.component';
import { MoviesComponent } from './components/pages/movies/movies.component';
import { SelectedMovieComponent } from './components/pages/selected-movie/selected-movie.component';
import { SelectedPersonComponent } from './components/pages/selected-person/selected-person.component';

export const routes: Routes = [
    {path: '', component: HomeComponent},
    {path: 'movies', component: MoviesComponent},
    {path: 'movies/:movieId', component: SelectedMovieComponent},
    {path: 'persons/:personId', component: SelectedPersonComponent}
];