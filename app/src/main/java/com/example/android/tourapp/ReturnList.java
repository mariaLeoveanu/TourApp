package com.example.android.tourapp;

import java.util.ArrayList;


 class ReturnList {
   private ArrayList<Place> mPlaces = new ArrayList<>();

     ReturnList (){

    }
     ArrayList<Place> returnList (String s){
        switch (s){
            case "MUSEUMS":{
                mPlaces.add(new Place(
                        "Romanian Peasant Museum", R.drawable.muzeul_taranului_roman,
                        "Șoseaua Pavel Dimitrievici Kiseleff 3, București", "021 317 9661",
                        "Tuesday - Sunday: 9AM - 5PM, Monaday - CLOSED",
                        "44.454686", "26.083563", R.string.muzeul_taranului_descr ));
                mPlaces.add(new Place(
                        "National Museum of Contemporary Art",R.drawable.muzeul_national_de_arta_contemporana,
                        "Str. Izvor nr. 2 - 4, Palatul Parlamentului, aripa E4, Bucuresti", "021 318 9137",
                        "Wednesday - Sunday: 10AM - 6PM; Monday, Thursday - CLOSED",
                        "44.428383","26.086570l", R.string.mnac));
                mPlaces.add(new Place(
                        "National Museum of Natural History \"Grigore Antipa\" ",R.drawable.muzeul_grigore_antipa,
                        "Șoseaua Pavel Dimitrievici Kiseleff 1, București","021 312 8826",
                        "Monday - CLOSED" + '\n'+ "Thursday - Friday: 10AM - 6PM" + '\n'+ "Saturday, Sunday: 10AM - 7PM",
                        "44.453184", "26.08463", R.string.antipa));
                mPlaces.add(new Place(
                        "National History Museum of Romania",R.drawable.national_museum_of_history,
                        "Calea Victoriei 12, București", "021 315 8207",
                        "Monday, Tuesday: CLOSED" + '\n' + "Wednesday - Sunday: 9AM - 5PM",
                        "44.431451", "26.097454", R.string.istorie));
                mPlaces.add(new Place(
                        "Museum of Art Collections", R.drawable.national_art_collections,
                        "Calea Victoriei 111, București","021 211 1749",
                        " Saturday - Wednesday: 11AM - 7PM" + '\n' + "Thursday, Friday: CLOSED",
                        "44.444759", "26.091135", R.string.colectii));
                mPlaces.add(new Place(
                        "Palace of the Parliament", R.drawable.palatul_parlamentului,
                        "Strada Izvor 2-4, București", "0733 558 103",
                        "Monday - Sunday: 9AM – 5PM",
                        "44.427506","26.087352", R.string.parlament));
                break;
            }
            case "RESTAURANTS":{
                mPlaces.add(new Place(
                        "Victoriei 18", R.drawable.victoriei_18,
                        "Calea Victoriei 18, București", "0749 416 962",
                        "Monday - Sunday: 12AM - 12PM",
                        "44.433255", "26.097978", R.string.victoriei_18));
                mPlaces.add(new Place(
                        "Simbio", R.drawable.simbio,
                        "Strada Negustori 26, București","0756 746 246",
                        "Monday - Sunday: 10AM - 12AM",
                        "44.435086", "26.111893", R.string.simbio));
                mPlaces.add(new Place(
                        "Fratellini Bistro", R.drawable.fratellini_bistro,
                        "Strada Gheorghe Țițeica 212-214", "0733 229 229",
                        "Monday - Sunday: 9AM - 10PM",
                        "44.472250", "26.078895", R.string.fratellini));
                mPlaces.add(new Place(
                        "Bocca Luppo", R.drawable.bocca_luppo,
                        "Str. Doctor Joseph Lister, no. 1, sector 5, Bucharest", "031 405 0050",
                        "Monday - Sunday: 10:30AM - 12AM",
                        "44.433886", "26.077839", R.string.bocca));
                mPlaces.add(new Place(
                        "Shift Pub", R.drawable.shift_pub,
                        "Strada General Eremia Grigorescu 17, București", "021 211 2272",
                        "Monday - Sunday: 12AM - 12PM",
                        "44.444948","46.101624", R.string.shift));
                mPlaces.add(new Place(
                        "Biutiful by the lake", R.drawable.biutiful,
                        "Șoseaua Nordului 3, București", "0733 500 222",
                        "Monday - Sunday: 10AM - 11PM",
                        "44.477243", "26.086804", R.string.biutiful));
                break;
            }
            case "HOTELS":{
                mPlaces.add(new Place(
                        "Radisson Blu Hotel Bucharest",R.drawable.radisson_blu,
                        "Calea Victoriei 63-81, București","021 311 9000",
                        "ALL THE TIME",
                        "44.441389", "26.094471", R.string.radison));
                mPlaces.add(new Place(
                        "JW Marriot", R.drawable.marriot,
                        "Calea 13 Septembrie 90, București", "021 403 0000",
                        "ALL THE TIME",
                        "44.425693", "26.07658", R.string.marriot));
                mPlaces.add(new Place(
                        "Europa Royale", R.drawable.europa_royale,
                        "Strada Franceză 60, București", "021 319 1798",
                        "ALL THE TIME",
                        "44.429532", "26.101600", R.string.royale));
                mPlaces.add(new Place(
                        "Epoque Hotel", R.drawable.epoque_hotel,
                        "Intrarea Aurora 17C, București", "021 312 3232",
                        "ALL THE TIME",
                        "44.436754", "26.086960", R.string.epoque));
                mPlaces.add(new Place(
                        "Athenee Palace Hilton Bucharest Hotel", R.drawable.hilton,
                        "Strada Episcopiei 1-3, București", "021 303 3777",
                        "ALL THE TIME",
                        "44.436754", "26.095596", R.string.hilton));
                break;
            }
            case "OTHER":{
                mPlaces.add(new Place(
                        "Therme", R.drawable.therme,
                        "Calea Bucuresti 1K, Romania", "031 108 8887",
                        "Monday - Sunday: 9:30AM - 11:30PM",
                        "44.605502", "26.08544", R.string.therme));
                mPlaces.add(new Place(
                        "Museum of Senses", R.drawable.museum_of_senses,
                        "AFI Cotroceni, Bulevardul General Vasile Milea 4, București", "0757 070 073",
                        "Monday - Sunday: 10AM - 11PM",
                        "44.430832", "26.049894", R.string.senses));
                mPlaces.add(new Place(
                        "Escape Room", R.drawable.escape_room,
                        "Bulevardul Nicolae Bălcescu 9, București", "0756 087 655",
                        "Monday - Sunday: 10AM - 10PM",
                        "44.437448", "26.101035", R.string.escape));
                mPlaces.add(new Place(
                        "Herăstrău Park", R.drawable.herastrau,
                        "B-dul Aviatorilor, Bucuresti", "Unknown",
                        "OPENED ALL THE TIME",
                        "44.478535", "26.081926", R.string.hera));
                mPlaces.add(new Place(
                        "Miau", R.drawable.miau,
                        "Strada Între Gârle 7, București", "0723 379 551",
                        "12 - 10:30PM",
                        "44.421559", "26.109242", R.string.miau));
                mPlaces.add(new Place(
                        "Bucharest Botanical Garden", R.drawable.gradina_botanica,
                        "Șoseaua Cotroceni 32, București", "Unknown",
                        "Monday - Friday: 7:30AM - 3:30PM",
                        "44.437214", "26.062596",R.string.garden));
                break;

            }

        }
        return mPlaces;
    }

}
