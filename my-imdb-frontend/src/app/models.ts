export interface Movie {
    id: string | null
    title: string | null
    release_year: string | null
    director: string | null
    poster_url: string | null
    cast: Person[] | null
  }

  export interface Person {
    id: string | null
    person_name: string | null
    age: string | null
    photo_url: string | null
    movies: Movie[] | null
  }
