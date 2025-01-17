package com.example.domain.usecase.movie

import com.example.domain.model.movie.Movie
import com.example.domain.repository.movie.MovieRepository
import io.reactivex.Single
import javax.inject.Inject

class GetRemotePagingMoviesUseCase @Inject constructor(private val repository: MovieRepository) {
    operator fun invoke(
        query: String,
        offset: Int,
    ): Single<List<Movie>> = repository.getPagingMovies(query, offset)
}