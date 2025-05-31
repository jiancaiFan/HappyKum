package cn.happykum.happykum

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform