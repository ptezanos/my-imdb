import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavigationButtonComponent } from '../../navigation-button/navigation-button.component';
import { Movie, MovieRating, Person, UserRating } from '../../../models';
import { ActivatedRoute, Router } from '@angular/router';
import { MovieService } from '../../../services/movie.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-selected-movie',
  standalone: true,
  imports: [CommonModule, FormsModule, NavigationButtonComponent],
  templateUrl: './selected-movie.component.html',
  styleUrl: './selected-movie.component.css'
})
export class SelectedMovieComponent implements OnInit {

  moviesTitle: string = "BACK TO MOVIES";
  moviesPageName: string = "movies";


  selectedMovieId!: number;
  selectedMovie!: Movie;

  cast!: Person[];

  selectedRating!: number;
  ratingValues = [0, 1, 2, 3, 4, 5];

  movieRating!: number;
  movieRatingObject!: MovieRating;

  constructor(private route: ActivatedRoute, private router: Router, private movieService: MovieService) {}

  ngOnInit(): void {
    this.route.params.subscribe(
      params => {
        this.selectedMovieId = params['movieId'];
      }
    );

    this.movieService.getMovie(this.selectedMovieId).subscribe(
      movie => {
        this.selectedMovie = movie;
        this.cast = movie.cast!;
        this.movieRating = (movie.ratingCounter! > 0) ? movie.ratingSum!/movie.ratingCounter! : 0;
      }
    );
  }

  goToSelectedPerson(personId: number): void {
    this.router.navigate(['/persons', personId]);
  }

  rateMovie(): void {
    const userRating: UserRating = { rating: this.selectedRating }

    this.movieService.rateMovie(this.selectedMovieId, userRating).subscribe(
      ratingResponse => {
        this.movieRatingObject = ratingResponse;
        this.movieRating = (this.movieRatingObject.ratingCounter > 0) ? this.movieRatingObject.ratingSum/this.movieRatingObject.ratingCounter : 0;
      }
    );
  }

}
