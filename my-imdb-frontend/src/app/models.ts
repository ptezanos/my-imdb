export interface Movie {
    movieId: number | null
    title: string | null
    year: string | null
    director: string | null
    poster_url: string | null
    cast: Person[] | null
  }

  export interface Person {
    personId: number | null
    name: string | null
    age: string | null
    photo_url: string | null
    movies: Movie[] | null
  }
