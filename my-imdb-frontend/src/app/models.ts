export interface Movies {
    movies: Movie[]
  }

export interface Movie {
    title: string | null
    release_year: string | null
    director: string | null
    poster_url: string | null
  }
