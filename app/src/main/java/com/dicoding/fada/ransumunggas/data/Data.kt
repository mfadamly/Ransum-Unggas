package com.dicoding.fada.ransumunggas.data

import com.skripsi.fada.skripsi.data.BroilerEntity
import com.skripsi.fada.skripsi.data.LayingHensEntity

object Data {

    fun generateBabyBroiler(): List<BroilerEntity> {
        val data = ArrayList<BroilerEntity>()

        data.add(
            BroilerEntity(
            1,
            "Dedak Halus            = 19%",
            "Bungkil Kedelai       = 27%",
            "Bungkil Kelapa        = 39%",
            "Jagung Giling          = 15%",
            ""
        )
        )

        data.add(
            BroilerEntity(
            2,
            "Dedak Halus            = 20%",
            "Bungkil Kelapa        = 38%",
            "Jagung Giling          = 16%",
            "Ampas Tahu            = 26%",
            "",
        )
        )

        data.add(
            BroilerEntity(
            3,
            "Dedak Halus            = 32%",
            "Bungkil Kedelai       = 20%",
            "Jagung Giling          = 29%",
            "Ampas Tahu            = 19%",
            ""
        )
        )

        data.add(
            BroilerEntity(
            4,
            "Dedak Halus            = 40%",
            "Bungkil Kedelai       = 16%",
            "Bungkil Kelapa        = 33%",
            "Ampas Tahu            = 11%",
            ""
        )
        )

        data.add(
            BroilerEntity(
            5,
            "Bungkil Kedelai       = 17%",
            "Bungkil Kelapa        = 35%",
            "Jagung Giling          = 36%",
            "Ampas Tahu            = 12%",
            ""
        )
        )

        data.add(
            BroilerEntity(
            6,
            "Dedak Halus            = 13%",
            "Bungkil Kedelai       = 16%",
            "Bungkil Kelapa        = 30%",
            "Jagung Giling          = 27%",
            "Ampas Tahu            = 14%"
        )
        )

        return data
    }

    fun generateAdultBroiler(): List<BroilerEntity> {
        val data = ArrayList<BroilerEntity>()

        data.add(
            BroilerEntity(
            1,
            "Dedak Halus            = 22%",
            "Bungkil Kedelai       = 22%",
            "Bungkil Kelapa        = 26%",
            "Jagung Giling          = 30%",
            ""
        )
        )

        data.add(
            BroilerEntity(
            2,
            "Dedak Halus            = 22%",
            "Bungkil Kelapa        = 28%",
            "Jagung Giling          = 30%",
            "Ampas Tahu            = 20%",
            ""
        )
        )

        data.add(
            BroilerEntity(
            3,
            "Dedak Halus            = 30%",
            "Bungkil Kedelai       = 15%",
            "Jagung Giling          = 40%",
            "Ampas Tahu            = 15%",
            ""
        )
        )

        data.add(
            BroilerEntity(
            4,
            "Dedak Halus            = 57%",
            "Bungkil Kedelai       = 10%",
            "Bungkil Kelapa        = 23%",
            "Ampas Tahu            = 10%",
            ""
        )
        )

        data.add(
            BroilerEntity(
            5,
            "Bungkil Kedelai       = 10%",
            "Bungkil Kelapa        = 19%",
            "Jagung Giling          = 56%",
            "Ampas Tahu            = 15%",
            ""
        )
        )

        data.add(
            BroilerEntity(
            6,
            "Dedak Halus            = 20%",
            "Bungkil Kedelai       = 10%",
            "Bungkil Kelapa        = 30%",
            "Jagung Giling          = 30%",
            "Ampas Tahu            = 10%"
        )
        )


        return data
    }

    fun generateBabyLayingHens(): List<LayingHensEntity> {
        val data = ArrayList<LayingHensEntity>()

        data.add(
            LayingHensEntity(
            1,
            "Dedak Halus            = 23%",
            "Jagung Giling          = 18%",
            "Bungkil Kelapa        = 29%",
            "Kacang Tanah         = 30%",
            ""
        )
        )

        data.add(
            LayingHensEntity(
                2,
                "Dedak Halus            = 25%",
                "Bungkil Kelapa        = 35%",
                "Kacang Tanah         = 30%",
                "Ampas Sagu            = 10%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                3,
                "Dedak Halus            = 11%",
                "Jagung Giling          = 15%",
                "Kacang Tanah         = 60%",
                "Ampas Sagu            = 14%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                4,
                "Dedak Halus            = 10%",
                "Jagung Giling          = 10%",
                "Bungkil Kelapa        = 75%",
                "Ampas Sagu            = 10%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                5,
                "Jagung Giling          = 17%",
                "Bungkil Kelapa        = 35%",
                "Kacang Tanah         = 35%",
                "Ampas Sagu            = 13%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                6,
                "Dedak Halus            = 14%",
                "Jagung Giling          = 10%",
                "Bungkil Kelapa        = 33%",
                "Kacang Tanah         = 33%",
                "Ampas Sagu            = 10%"
            )
        )

        return data
    }

    fun generateYoungLayingHens(): List<LayingHensEntity> {
        val data = ArrayList<LayingHensEntity>()

        data.add(
            LayingHensEntity(
                1,
                "Dedak Halus            = 26%",
                "Jagung Giling          = 38%",
                "Bungkil Kelapa        = 19%",
                "Kacang Tanah         = 17%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                2,
                "Dedak Halus            = 25%",
                "Bungkil Kelapa        = 25%",
                "Kacang Tanah         = 25%",
                "Ampas Sagu            = 25%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                3,
                "Dedak Halus            = 29%",
                "Jagung Giling          = 24%",
                "Kacang Tanah         = 36%",
                "Ampas Sagu            = 11%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                4,
                "Dedak Halus            = 20%",
                "Jagung Giling          = 20%",
                "Bungkil Kelapa        = 50%",
                "Ampas Sagu            = 10%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                5,
                "Jagung Giling          = 20%",
                "Bungkil Kelapa        = 30%",
                "Kacang Tanah         = 25%",
                "Ampas Sagu            = 25%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                6,
                "Dedak Halus            = 15%",
                "Jagung Giling          = 13%",
                "Bungkil Kelapa        = 25%",
                "Kacang Tanah         = 25%",
                "Ampas Sagu            = 22%"
            )
        )

        return data
    }

    fun generateAdultLayingHens(): List<LayingHensEntity> {
        val data = ArrayList<LayingHensEntity>()

        data.add(
            LayingHensEntity(
                1,
                "Dedak Halus            = 50%",
                "Jagung Giling          = 39%",
                "Bungkil Kelapa        = 11%",
                "",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                2,
                "Dedak Halus            = 40%",
                "Jagung Giling          = 50%",
                "Kacang Tanah         = 10%",
                "",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                3,
                "Dedak Halus            = 98%",
                "Jagung Giling          = 1%",
                "Ampas Sagu            = 1%",
                "",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                4,
                "Dedak Halus            = 98%",
                "Bungkil Kelapa        = 1%",
                "Kacang Tanah         = 1%",
                "",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                5,
                "Dedak Halus            = 74%",
                "Bungkil Kelapa        = 14%",
                "Ampas Sagu            = 12%",
                "",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                6,
                "Dedak Halus            = 68%",
                "Kacang Tanah         = 14%",
                "Ampas Sagu            = 18%",
                "",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                7,
                "Jagung Giling          = 82%",
                "Bungkil Kelapa        = 9%",
                "Kacang Tanah         = 9%",
                "",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                8,
                "Jagung Giling          = 43%",
                "Bungkil Kelapa        = 35%",
                "Ampas Sagu            = 22%",
                "",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                9,
                "Bungkil Kelapa        = 28%",
                "Kacang Tanah         = 20%",
                "Ampas Sagu            = 52%",
                "",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                10,
                "Dedak Halus            = 21%",
                "Jagung Giling          = 64%",
                "Bungkil Kelapa        = 10%",
                "Kacang Tanah         = 5%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                11,
                "Dedak Halus            = 35%",
                "Bungkil Kelapa        = 16%",
                "Kacang Tanah         = 15%",
                "Ampas Sagu            = 34%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                12,
                "Dedak Halus            = 40%",
                "Jagung Giling          = 33%",
                "Kacang Tanah         = 15%",
                "Ampas Sagu            = 12%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                13,
                "Dedak Halus            = 30%",
                "Jagung Giling          = 29%",
                "Bungkil Kelapa        = 25%",
                "Ampas Sagu            = 16%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                14,
                "Jagung Giling          = 35%",
                "Bungkil Kelapa        = 20%",
                "Kacang Tanah         = 15%",
                "Ampas Sagu            = 30%",
                ""
            )
        )

        data.add(
            LayingHensEntity(
                15,
                "Dedak Halus            = 20%",
                "Jagung Giling          = 25%",
                "Bungkil Kelapa        = 15%",
                "Kacang Tanah         = 14%",
                "Ampas Sagu            = 26%"
            )
        )

        return data
    }
}