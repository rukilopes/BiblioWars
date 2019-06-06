package com.example.bibliowars

import com.google.gson.annotations.SerializedName

data class Pessoas(

    @SerializedName("id")
    val id : Int,
    @SerializedName("name")
    val nome : String,
    @SerializedName("height")
    val altura : Float,
    @SerializedName("mass")
    val peso : Int,
    @SerializedName("birth_year")
    val datNasc : String,
    @SerializedName("gender")
    val genero : String,
    @SerializedName("species")
    val especie : ArrayList<String>,
    @SerializedName("films")
    val filmes : ArrayList<String>,
    @SerializedName("vehicles")
    val veiculos_usados : ArrayList<String>,
    @SerializedName("starships")
    val naves_usadas : ArrayList<String>

/*
ENDPOINTS
    /people/ - todas especies
    /people/:id/ - especie especifica
    /people/schema/ - JSON schema

SEARCH FIELDS
    name
 */
)

data class Filmes(

    @SerializedName("id")
    val id : Int,
    @SerializedName("title")
    val titulo: String,
    @SerializedName("release_date")
    val criado : String,
    @SerializedName("director")
    val diretor : String,
    @SerializedName("producer")
    val produtores : ArrayList<String>,
    @SerializedName("episode_id")
    val episodio : Int,
    @SerializedName("opening_crawl")
    val sinopse : String,
    @SerializedName("planets")
    val planetas : ArrayList<String>,
    @SerializedName("species")
    val especies : ArrayList<String>,
    @SerializedName("starships")
    val naves : ArrayList<String>,
    @SerializedName("vehicles")
    val veiculos : ArrayList<String>

/*
ENDPOINTS
    /films/ - todas especies
    /films/:id/ - especie especifica
    /films/schema/ - JSON schema

SEARCH FIELDS
    title
 */
)

data class Naves_Espaciais(

    @SerializedName("id")
    val id : Int,
    @SerializedName("name")
    val nome : String,
    @SerializedName("cargo_capacity")
    val capacidade : Float,
    @SerializedName("cost_in_credits")
    val valor : Float,
    @SerializedName("consumables")
    val consumiveis : ArrayList<String>,
    @SerializedName("crew")
    val tripulacao : ArrayList<String>,
    @SerializedName("hyperdrive_rating")
    val sistema_motor : String,
    @SerializedName("length")
    val comprimento : Float,
    @SerializedName("manufacturer")
    val fabricante: String,
    @SerializedName("max_atmosphering_speed")
    val velocidade_max : String,
    @SerializedName("model")
    val modelo : String,
    @SerializedName("passengers")
    val passageiros : ArrayList<String>,
    @SerializedName("films")//plu
    val filmes : ArrayList<String>,
    @SerializedName("pilots")//plu
    val pilotos : ArrayList<String>,
    @SerializedName("starships_class")
    val classe : String

/*
ENDPOINTS
    /starships/ - todas especies
    /starships/:id/ - especie especifica
    /starships/schema/ - JSON schema

SEARCH FIELDS
    name
    model
 */
)

data class Veiculos(

    @SerializedName("id")
    val id : Int,
    @SerializedName("name")
    val nome : String,
    @SerializedName("cargo_capacity")
    val capacidade : Float,
    @SerializedName("consumables")
    val consumiveis : ArrayList<String>,
    @SerializedName("cost_in_credits")
    val valor : Float,
    @SerializedName("crew")
    val tripulacao : ArrayList<String>,
    @SerializedName("length")
    val comprimento: Float,
    @SerializedName("manufacturer")
    val fabricante: String,
    @SerializedName("max_atmosphering_speed")
    val velocidade_max: String,
    @SerializedName("model")
    val modelo: String,
    @SerializedName("passengers")
    val passageiros: ArrayList<String>,
    @SerializedName("films")//plu
    val filmes: ArrayList<String>,
    @SerializedName("pilots")//plu
    val pilotos: ArrayList<String>,
    @SerializedName("vehicle_class")
    val classe: String
/*
ENDPOINTS
    /vehicles/ - todas especies
    /vehicles/:id/ - especie especifica
    /vehicles/schema/ - JSON schema

SEARCH FIELDS
    name
    model
 */


)

data class Especies(

    @SerializedName("id")
    val id : Int,
    @SerializedName("name")
    val nome : String,
    @SerializedName("average_height")
    val altura_media : Float,
    @SerializedName("average_lifespan")
    val media_vida : String,
    @SerializedName("classification")
    val classificacao : String,
    @SerializedName("designation")
    val designacao : String,
    @SerializedName("eye_colors")//plu
    val olhos_cores : ArrayList<String>,
    @SerializedName("hair_colors")//plu
    val cabelos_cores : ArrayList<String>,
    @SerializedName("language")
    val lingua : String,
    @SerializedName("people")//plu
    val pessoas: ArrayList<String>,
    @SerializedName("films")//plu
    val filmes : ArrayList<String>,
    @SerializedName("skin_colors")//plu
    val cores_pele : ArrayList<String>

/*
ENDPOINTS
    /species/ - todas especies
    /species/:id/ - especie especifica
    /species/schema/ - JSON schema

SEARCH FIELDS
    name
 */
)

data class Planetas(

    @SerializedName("name")
    val nome : String,
    @SerializedName("climate")
    val clima : String,
    @SerializedName("diameter")
    val diametro : Float,
    @SerializedName("gravity")
    val gravidade : String,
    @SerializedName("orbital_period")
    val periodo_orbital : Int,
    @SerializedName("population")
    val populacao : Int,
    @SerializedName("rotation_period")
    val periodo_rotacao : Int,
    @SerializedName("terrain")
    val terreno : String,
    @SerializedName("residents")
    val residentes : ArrayList<String>

/*
ENDPOINTS
    /planets/ - todas especies
    /planets/:id/ - especie especifica
    /planets/schema/ - JSON schema

SEARCH FIELDS
    name
 */
)

