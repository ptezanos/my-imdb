import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavigationButtonComponent } from '../../navigation-button/navigation-button.component';
import { MovieService } from '../../../services/movie.service';
import { Movie } from '../../../models';
import { Router } from '@angular/router';

@Component({
  selector: 'app-movies',
  standalone: true,
  imports: [CommonModule, NavigationButtonComponent],
  providers: [MovieService],
  templateUrl: './movies.component.html',
  styleUrl: './movies.component.css'
})
export class MoviesComponent implements OnInit{

  movieList: Movie[] = [];

  homeTitle: string = "HOME";
  homePageName: string = "";

  constructor(private router: Router, private movieService: MovieService) { }

  ngOnInit(): void {
    this.loadMovies();
  }

  loadMovies(): void {
    this.movieService.getMovies().subscribe(
      (movies) => {
        this.movieList=movies;
      }
    );
  }

  goToSelectedMovie(movieId: number): void {
    this.router.navigate(['/movies', movieId]);
  }

}
