package com.github.gdgvenezia

import com.github.gdgvenezia.meetup.MeetupClient
import java.util.*

class RepositoryImpl(private val meetupClient: MeetupClient) : Repository {

    private val socialLinkList by lazy {
        listOf(
            SocialLinkModel(
                title = "Facebook",
                code = "facebook",
                url = "https://www.facebook.com/gdgvenezia"
            ),
            SocialLinkModel(
                title = "Twitter",
                code = "twitter",
                url = "https://twitter.com/gdgvenezia"
            ),
            SocialLinkModel(
                title = "YouTube",
                code = "youtube",
                url = "https://www.youtube.com/channel/UCnXHsg8plcHc_NuCETV2k6Q"
            ),
            SocialLinkModel(
                title = "Meetup",
                code = "meetup",
                url = "https://www.meetup.com/it-IT/GDG-Venezia"
            ),
            SocialLinkModel(
                title = "Instagram",
                code = "instagram",
                url = "https://www.instagram.com/gdg_venezia"
            ),
            SocialLinkModel(
                title = "GitHub",
                code = "github",
                url = "https://github.com/GDG-Venezia"
            ),
            SocialLinkModel(
                title = "Telegram",
                code = "telegram",
                url = "https://telegram.me/joinchat/CrhySAbNTvs7BZACfpQyyQ"
            ),
            SocialLinkModel(
                title = "Mail",
                code = "mail",
                url = "mailto:veneziagdg@gmail.com"
            )
        )
    }

    private val teamMemberList by lazy {
        listOf(
            TeamMemberModel(
                firstname = "Andrea",
                lastname = "Maglie",
                pictureUrl = "https://lh3.googleusercontent.com/yl5L_pUQlcBsHeGmedw-WzjdxOLXUMkEdLNrKCUY1ymYGAlbfNtYpMRPjtvrDeIRYS9zzppShgzqg9pbEwEEjTxjDUrUHYd0JpdA1I2NiEOOJQ_6iymFeCjfOeUk7RGv23HtKBCKVelEfinNv1gQQS57PVn4UdDWO7vGg2vdqCa4_nb7DoueoGVKKQsJ59Gt_i944VuFeobP2CDkRq3r199hiwqeINZBTLvikd8GLOMZIGtF_cV3ORrje8hkAub0Q_dtb7WeTx2Mtj0TNY9zIuzd4k4g1Lt8T3-AUj_8Gp5iWHl-1h1aRlgDzFlg52l-Oy8cOzR994cQhKcymFrO8uri73--42K-EpHOBKlBWawZ1_Zes-93HshnvznCd7QBrAtyOyR8xlq4CdZlFc8WY1QCoLCcKz1WrnEO4IdodzSR7EIbcEPzMdYp1rqMlsClQZDvftvkMlUsl0x0GOc0WpI0sbBkK_Zl9wW7c5xyEvLjZpr7Qh9piYN2ni7Skmp3ffcqlBGi9brd3Q5sg3BhjVVVjg51MWU5pZJkCgSaDl-2mM2ij3YvyQ1KVGztNDR7ip6YCtyI9v_9RzSi3x0Oeq4gp036-EPWv3Mz5cW49VnfsZ6-AQa-wucRSGWcQQpLIBTjI7E-eVzG8ikCaIazaY4WBuZr33B0NFMTKp51DM4IsEdxYCAcq3E=s370-no",
                shortDescription = "Senior Software Engineer",
                longDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
                twitterUrl = "https://twitter.com/TechIsFun",
                linkedinUrl = "https://www.linkedin.com/in/andreamaglie/"),
            TeamMemberModel(
                firstname = "Marco",
                lastname = "Gomiero",
                pictureUrl = "https://lh3.googleusercontent.com/sB_vqEkjJLRDW25oQI0jPCUbN2PTieoQ8oCmk9S2FaxZdjv12nk0kmNYM2ISiFx_yR23S-ptUGlpV5WG2Tg3-JyjGSBz9r1Pf8rZzPEZeVjjyMd5i-PShK-q20S6-1szck7PT8G-QZHCOuKSSqCgbCYGRSDZsjMe70n18I4msQdDDEz5vpoxYxiQG1RKkPwhs0bWQRPEqEBfFEcCtN36B-XTx2BlaBiB3aGcytkouNECSZQLO4z17fMS5ELEjpBBIhNIUQarwpd8K0WJqjQkN-5QYU4rokQCBsJmMEtbE1kl8HuRs_j5IH1PVjgHnRGfto28clSWk0xyohQllLFVrOl90XqUIBrCP_gHnGHJu_1xQKUKsY50pn-W6JK8jnRgpMWofT_Vq5jvEt9IrLPWgupltwRoEp2RL-JFGkK8ILrksSl7yJGuuqu5zhQ4lQz9ADu_NKemvLoAwslKmj6BiNcfwfcuou0RVEPzjiUrEV1rwJwVzrmMPeuD7gOSEROVn1Jf2Z5_e1xlE_ICHwnGJOlYup22kJYAi6EWQmeZ7074NcooJ1a39i_Eeh-KFRwX35T5FUsfsNZbpikowTEP73EIzuaeBizaYr-ryzIBGsPT6H4up-5WlLQkx3jVMKWn_qkPn3EAhV6FFW8ZUMzV4Ic7IwJOK8MFWWukdAu0RQ3JdenKW7jaa1s=w1806-h1798-no",
                shortDescription = "Mobile Engineer",
                longDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
                twitterUrl = "https://twitter.com/marcoGomier",
                linkedinUrl = "https://www.linkedin.com/in/marco-gomiero-a80857ab/"),
            TeamMemberModel(
                firstname = "Simone",
                lastname = "Formica",
                pictureUrl = "https://lh3.googleusercontent.com/oKvgpNKkaQXZ_IhETODaq6CLiskQ0U11vRxV6w89EDrL3AUkUeMrtV-nJuwYKj1YgjFETp66EfeuJJl74lu-NahWIMOzQwF_mcig30_713z0poifInHodNYN4OgruGt0BNk2haaSBeWk9Ir6TTYJQjGtJY5U_vlhr3OUvaaGkodzkOxC_pOfp_vcTM43MPwWmCD5hyI7p4-XHO2TfB0HOwZwVMssG9n0D8vcgHTprd7H29lc-B1XZTOC4UARMj7uvmtibboIf3D6-t60BNAKuLLxtn0g5ygDUc5ELnWD_IEpNcmVCHift9syyaAnNV5DIllNkiBmrteZAmyVR9wk1WQKI6To0wQyV_3JYnYsQbVxLyc0E8JhTqxZHWo0woT0QTOvdWowsrqOUA0CRTMGckpQwHQJ_09BxQMyKKSBGbbWchqnGfgP5AOfWYlEDhmjUeRWIkqQxvBd3EvzaPnKoQTiep4gGoryqGvG5Mn_w4YxQPSxZHrFyYQjENpRXYNRL90wT4D17ANNPQEdvwCa1VUl2t6v_ZY3hGYJa6MG9BPFW1qyItJyXP8f4KT9WX3aIxJbOgTXYhcMu1d-KpzP5Cs2PSeBTiW-Mm-N6gphPNAXD9kgQOYWdr8BFdzrTD-KhPpX7O2XCWyzhDPKnxoLKi9LrwegzZMWx7hUVBBcWmr_QmGvuc4KPxA=s400-no",
                shortDescription = "Android & AOSP Developer",
                longDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
                twitterUrl = "https://twitter.com/SimoneFormica",
                linkedinUrl = "https://www.linkedin.com/in/simone-formica-4b464b114/"),
            TeamMemberModel(
                firstname = "Omar",
                lastname = "Al Bukhari",
                pictureUrl = "https://lh3.googleusercontent.com/diox0AOWa4BCIX3Y0jTYNBJgsDfyxgPzO0H1Z1fE9tlTbrivmZ-Q8ul1uPyULYNedSN7-F_liTkfNX1L8mReRFo6piaYE-zxnsgr2xe6aURNMYh_DN0RHaR0AQjiIEEs5mVQ9UXaa_l8aEFQP9Th0o3cuS6VaJBaYNPohoInP2zUu3jcQA-gZl2dLivQatqNS6RvfXFJV4wFissw1ENMfL1BzEXd6ShGNolPveCnbmGzsZd8S_xMbbFfayq7VpFZmWKeuDTUz2vISGAUt3LS8gUt0jJSco_9Mu1PdokkQMKMeZhO6fCtCZyYx3crkMVQkZYBvkdbcZzn9WqybgtQvMobGSd5vIViWfT-mevz7GTGkZLwZzLxIZKU4FGxTNlVecP7IZOzV84s9lKtdvLTKhp_lkqlyZ-NM7JwqR6g5M0Mi83chF2pPOn6VRbJuvoY1aKgf_6BgIZy1fWBQ4htlMV7WRcB3_ZR7s0uGqukMSEAQjHxyLia2zjzRiWuORD5s6P7sr_9eWhYUNHamLVsX0_CpIHetqdPgjRktLCinFUG6j8Go9gzQxBuQ3jYUMXBYscT_79M-P_vlqvMA7f-5M4YOe3PkwS18rh6IB1KAVX8AsdlktXH19uuvT5SS-8SkyOpqBSE4AeESnG4Jd76GzdXuN75IGIJjexJFe-UvdmRpEDwRep2coQ=s200-no",
                shortDescription = "Android Developer",
                longDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
                twitterUrl = "",
                linkedinUrl = "https://linkedin.com/in/omar-al-bukhari-01776b111")
        )
    }

    override suspend fun getEvents(locale: Locale): ListResponseModel<EventModel> {
        val future = meetupClient.getFutureEvents(locale)
        val past = meetupClient.getPastEvents(locale)

        val items = future.plus(past)

        return ListResponseModel(items)
    }

    override suspend fun getFutureEvents(locale: Locale): ListResponseModel<EventModel> {
        return ListResponseModel(meetupClient.getFutureEvents(locale))
    }

    override suspend fun getPastEvents(locale: Locale): ListResponseModel<EventModel> {
        return ListResponseModel(meetupClient.getPastEvents(locale))
    }

    override fun getPhotos(): ListResponseModel<PhotoModel> {
        val items = listOf(
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/Ce4fWZkPbgHo2hOwNRTtSILXUC9G4qLaMxEFZ9X4lNdMFGBG0d8ZK876mtevnwrsyyHRgrB3iL0dPpcz6GxiCrTY2djh1Ho99NWd1dsjv6bJncVeqXP2MM12gc5ieo8_qwNRPK5js1TOnY-WpkGuZ45ErNzxAWepMj-FhQnJieJPF-oZQMibjZTiC4D642bkjDdUs4iLNcLmXF_Jioua1Y5GZwDeJm-DvN6wkq6tmu4fREU1e2p2bLxsgbkDgk3uDseLcQJNjXt9QQMSgVZGi0VdhhmggGPW2aFnBoWnWS__UOLQ3y2HbDlOmgOnF338Ke4J1TEO_cOjQ4AaQHAaeFejxXw5V-JPk3piUO3oYKUo0GhrCq7RIM-9zKzkFBIIQB9bTvosJgeV13MfqxtEr0oE8m4JZWaoZgNTQ_LO9Nx4263s_7LZMI4QcFEpO5RkbYgtFkFa0Vas8xjNH3tlm2fkylbyFfaEhNVoPVsErvPm4hLLKybk3qMvU4f-kRmp5eDlXHWmrGybF0tOCtlfS1LVKDlhVQ7-Pul-5f-sSG_GNiO15ezXDZf_nc5QwuLYiqxv-Vfo66vYBdTNDsgliA5wAMgDYxwZEqX9-DeCNXL0Q22uoSC3Pm6eI83BWqyAgk5XRwmvV7k9HAohlTQyZjLdsXqKMAu2wbzJGgLtTUjAjEV8iTqNDHWq2MGOar9oKvF26MUzZicTIhmVjuyWTgYU=w2444-h1832-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/7dwwKmEQBe8KKbBArvTw2O2aZkOGr2QSmyJIzusHDFgLTV1Otynmr_WoPObHlhL79_l71acbyGSjKXL4AqRJ8xfjgxONXpgUC4U194pr9JiOxwNtOBexIJ03PF4TONc2tNMFr-GGijXxdxpeEYoiUcQKZGiQDh1OpG234HmtXwDa8yWCpCeqUWNpsTKVZ2y2HXNid4FCOq8GkheIqe1mWM5zEbqIxYCpHHz9wm36UuVJprwu08AzoO8xJXKZA0yW7ICEqH5qsOR4ezNVubuATQjs2P675NTtrIC254XCC6nACjkJ4V_vSHZSU5eb0n5_2mUzWZ2QXJtFvkZV4NcT1jAkDMXsFXuB4J5CR7PFkGOOJzHLvkpfU36UceKoa80fYHtEbdgcKxYQFzV-rGkXkPC2lplm_nTGIfb87AEhPhSf5xkirYbg91ATUyZNEvfxPF3WcNPgoUs2W3Eq48y0MjKt0KsG8lL94DVo53fdKDnyevQmRG44MuxLXb-Dy_3NLhFY1VgoYw5j4jrViD3j5OzUs4abSbV9-zxQ2Xnwx5c2Av9G7EOfbTOvWjkG457_FLmHsWJ3U2ETSmJ4kepFnq4pCX1T9xA-3aRziFbkjbCTpgu4a3eTP0yop13E8ESYVn4plSKHqdk8CuCfru9SRdDD9WfFaQ1WEQj1Q-ymn9HQqIpu5gELEvCELUTpg2eL9tH7TxLQeLvfEkOphH5b-R6e7Q=w635-h291-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/mQrn1JmsLr2R61vM3lh3D8NItyoAuYyojczjdQkyEol2UJym7kU1_kjl9cl7m7ztDycrscHVmQr473O1_6Dkl8IjNVZaJJJ7_nprqw0-WhfbiixvKPklUbL77IAK7Hc-t-kiinTIBX_AEgEhVOH8QS_SNl8CS6BaK5hGkiD6GWJwFGrU_gPl9ioh6-xoedTZ-SZoac1thClYEtoN1zUubWUjWDNumtRLAX_H1mVI1yiPTk-ub-kCz5twUM-1B_eQ5YSgT2tF1etAKipflu8iPKmc1ORDF2ntzbsnSKHMywzaVmTCeuzljyN5v2M7nrnM2NN8AIVNxdXDlsUlE3aVTqxMdQqKFBy4L-Yg4cirIp38K-o8upJ_5kHR4wupYojR7iNwgxrNoqfh8wFh2VsFyNAPBWIuIJnR2P4RbbELn3YosX0eMkhF6JF693hUoW8ouUEjPBXsv2nZuj6uNezEN-7Komc5PamjIV721BtuA1W6xtnwIupBwvrTDFlM122mqf8vQ_Nhr5rKAq9n6Nf4Fj_JYh4GDNhc0jL4Qw9E-_02UO6CAT65iGL_FJymrzAwme0yxcGm8XSLgR_Rjeev9PDyQQWtxPf8CW5ts6gWZd9GgM8wR79_pBDVVrSNJHHOzKj0RvlNJUyGrS5ByS8B1s1fOFSFeVof5ZiX6-w4n6FtfqLGc6Yhdds=w2846-h1898-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/XifdjiMDQoJuSYrnz2vccmZauoqFMWm2-UNrEkY3l5mjDsdAJVdEzZ9c5NxVFayZEyZ_Mssl4orDxGYWPxwRX8JwUqRj394upo7XYL9OtK2mTDUQankQiQ8CgV5NH54Jjdjf2aIBW_TWTLvwgWv1y2WzMdfnTDIYXfws3WOl_Md-6wwzshwPa3Z7SXMjkpq5lK4b9hTriHGgHvO_VTjsdYoVVxnsMHUjm1ZX04v0_LEwZ7IRSzNIgNEDQW0vy0vZ-7NEEQvxWimwijhjx6P44wcERKND8L0S6pANMQxBGjB6UpNuRLaGRZ_hVdzWBryrS_wBXjcb5j5wpczgE-X-SH-LIsLnxgRDivBl6fOZw3iDOrXdKNYywLAPkRFYzD7adqW3yKbzkDN5DS_GR-Z52eZrq8niQ05kWWHE7sdfDoNsvta-q7d1BWy_OcidF4-iiR0-0Gr-mf_ddD-CjFncckPf4IiQV2FtEQBW3aE_R-s2sFYa--OvfszYRn3GC87vDrLQDEQG2OnOg9VFIFcc5mJYyHEQemjpOwB1DTXwS_gKJoRsSu7bATDo3CL8iyFSgcHM9M6HUxMQxrnp6YQcBqz2tB7AqnHfDJShaefUlZBpXqy4BcSCXmxKpQIDqvg_2_ahDtz6wTi233zW0B0CKofW6BhcZGtIaH16Q6A3oAWZxPCyF2NyMxA=w2846-h1898-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/d5uCLqPmVbCqxQKatK6DARKqggjbtnW6EBJR9v2S8GZBjtlgwd9m_QPKZfO_fs-XjzDbrX8jkZpzerDy60KXv-QcWhQoOVnCmablYYpuI4rlZ_bxV_EH-zqkY9rzSNnFTrxqItK2YLCNPfD_2pVMdI1t4kzrGGJ1QIgok_aETEpLKBWJ-W0cC5mVUGE82oMiFhVtCJ2kHMRViPJUSo2ifAlbl2-JTP0uC4GfJGYLip8chnhq3romNbHNi6jcnwai8d9Lxz--VvDz87HpjNd5ti0qm3-uwbXK8KloRtE80oqg8r0SZ_nJdPrQD8ErISVEkg4JVlfPG6yUN6wE3pH0zYZPWhKu7YGtUbGFGMipxNeVg-4kxexIVZah1dvww-1ZqQPpRDVMeIgFWKb9HM7S2hYsggkZbUswvtx_bOfIJERx9UP-lt9n7HhkxhqbEla9h4XvObR81BV_ZOPE1W7AfQzqBre-IUEBLI0PWTYhHykvs5_UdiBErFTQvfvuoD5mtjv6942fbOELk3pd1FQC7hBvutw07zxg6yBs2VjrSv49NhVggZqk7bLu7V3-YQ6aG1BoEWpAP-loEY19_8FX1FKPpBvlT3SXaDWgdATR6Jwl5YM5vgZ08qXHJPOQB0nBA14miqLVSRRjk6p6clphZLTYqD6dePRLo_OkPtoN8huvv9oweNgDAc0=w2846-h1898-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/XHZj22x-DhTgHFi_jXWCdQb1fTTW7rKRpQxOoZFNmYi6ahNFl1YGl9Ub9j2NRHfirpl1usM7eruW1xUrMjFDepiZIF2genC3cyMsn0n10UH__bWKUnQlnTyyjJEaLECIESaKTtTq0Ih0u_mNbf6kR_K8CfSr98LSFksLzaCwY0R72-AGDh3xqtfy2N-8ApwMo5IIf1TE2wulj2XgFmY9C3_-VQLjdZ-ABZbdbT8qVGEiWkLNSS1XXi5GslizbmD9_q0XFLwh6D4Zy2X5_Jvb3HOaSj_KeoZxS4dZDuHw9zNQ9tEftk8svgScxj_HbzaGilybfgVLKkLbQFQLdfWJncwCrnQTwb0HerA7xK-gDcXm5icyZl076z1UkTJw-W6iOWsuX0OFVlCXSCRkT_nnFIAYclgeKbN_A6KvWsdHHQprmtFkw_585EJQsMMzQX0cqJt819pEj5Dc5Uqp8fe0QVBwfRN_gQE-91DkM7SzrIoNk9oJRip_Z-gvraN86owrsSKjdUW0Nh_DcozWAoq7ApM9yqG2msi1iQ1nxQEREYHFrTiYnLJWqCAhNH83ILY8HQ3ofkYXDB22PY6VbQ0jWvywmnmpcB3A31iGcYlG5IF636qhgWeTqFagDdGimVV7MRQUPx9h9KHG0RP5eAGPpuI3lDW5fX21dkL06UgRypFHS9sDwgclJ-pTr2-uJeTduzxZEE-AakMggSHFzuz4W0rdvEuYuNTSYMlfl7m_IiP1lain=w1422-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/D7LufQ9yZWZjNtY3am40NWyLqNAYSrb2iASKHKZcxWnbhN39HCqT5MSMPvtvvv0lm5VDUD0T7OdnCnW2yksOJzCKgq6NVByJWktuGNe5w8-DI8TdxygF7BQ2Qjfocs5tt2OD25FeQihde7nEJEadKuwnyEHnukh3i-K8M_Rz7UG4n8232_OZAb0VxyrLrsJuMHzLuuk9BOxWmJ-8cvssYdRzcaBp6ogffwjg8t2qge1x6Jumaiz9YvPLBjPt9QN_s39WRKGZwxSQqfEJYQ9d1bL5PfaMh6eRDvGGoD5TPuS4E-y3ywkXvmC5TIRx0d2GasCiCt1NFbVpyHthtsqNfnCSPHCVOvlSMld9HRKsa0wHApZzrfA_Yp-JevOxAwe3oolGaJttgJjaldqdnlyEl5Z8c2Pt3MlS1vL-E-Bqk3hGN6kKbHxVBWoWHpw6JX2T3z1zj7KG4fdhGiwyhsztxchsQG_eej8KqiYOz-TRyFm2Zw06d--HZOidQfRktDgMXBdLRImR0mhpYVoZ4cQl8FMHJTTOVwy74s9zkiHnLg_pJzAJ0BPD0PS1-CedZUuwfbKpukhWC5Od8L5t85Tr4Tckv35opXFhM3bEYMKlZXTXBE0wgBCcfjetwCrEm5oT8sDUt6lWXxvmG8hWOsCDicGfCdL2jSEntyVchT6sY-6q6GRI5r9kbTSlu1dIkfYCn6YAanXVxiE3WaKVMocdOOjT-zYOhiFcHbFozwzlesaWz2VrEA=w2844-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/q52p5by4-wo-CzLzDbNpE1WBYlzvhBEVS0esYne5Ku6ZGLdpLM_ZpnggClmREBmmJwxRTxFQrcVv3KdbPwlDsMnusttkO5LSUmIrO1kvy0e1o3-ZtDx2v5WrT_2D1EJGRD15qAiBgJgTZMX7If2udLKlp9JlLsBSgpp28XGbyr0-hRP-J0zQF1PrA4A3vp7RPUNVp-SwYgY3if0Cg9fgdZgslpJZNYxexml_EfNMyQoZEaiUUOtJO--KIF5Hq5vxwT_68zWqNBfpMQnXw0nAw2Q-LGmqvmdwsVQy8ZEUk4OACFouYmlRCJBy7BixkUXyIHfylLsXki2yEWpEjJru1fu-ksHJvLC4sbBcMt0NjPZtQ32hUIAGaikK9X6V3qUDqGjkqfLBiN6dcPjTNUxn60Z83ed5CLuqOGRa0JG0BMlwtJhkKoYkP1ZNkQIzyhx3vu9zNuFyJ21UcO6kYat2n_Z85Pjc6Gk9PjCmKor4ydOHGcB2BOQcGl8B2QSijcImTS64q2Vy_5jfyv_4Iyg7MgJW1_CHFPkBT_5I-7fIK9n8i8T7tQPiWiNm-idCqqbOTcKJiD18hRHHk9UC6u4eoTZNN3XUJyRFICgIpCBgi5KdJzsYn15oLgMUWf-jqdmP9v7z1QFDzuEtvGSkLOyFWuCH_rLyoYV9V9dLDUTm94JQ5ZYEyWev-7Z_At_dF36DI0bIS-XtG0oN3CRA_VtmRaQFtfINaMznyucwehpeC-JV7zIyhQ=w2844-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/45TE8szN3SD3xZlUIL2MLrmg1SlmMM2AU2sPgAgbCn2_542NBPNjJFNemEVReetJCH5DwioJNqEjqKUKIHRGrVdhTwYv6T2l-KlINa3lfuO1n5JfodUfNbRxX0R4KQ7PF-IMLrTR574pc5U84oSU-F8nJSbC5lvRDNulgslFsxYRppNVpi1vZBN7sP86xm7FwnDNxhM3nqTqP1gRDLFTeHdK0GCmrUQdLnaQL6gusZGIQzgtkjnWa-Etjf88-uPDMTVlhYg_aLiY-pCUYptXdsUM-hckkW3G_P_-NiHVI3wCP9mYwAQX53R-nK230B9Z6b5ys_1M9o88AxMqBRHzO2WV19H4Zxhx7awSI3EP1itXE2IgdLhUMXHuryFi_JJu8X1qEcp_S_-h-JqzUI_nvvl1EgwmP_pcpK9qzk_4h-ZXFqbAEyr_csXw7v5Oq7KqZfHGpZV4tDU1FhbjWrA5nenhMBBIvQK3PntBa2ROzxeCLNJwkcqzkR4IZ4JszHfvUkMaPUSHIGoYgRc4w7fXoPFwJlRTEqsBnxGy_Yc4Z0x6xJiO3Ek7rjAXAJkR0jvD7ifsc6OwxiVJSvyKk2-jyRBHwhUHucCmuz828MELaEFl2-bJF3fkybVoiOspq9GrmIIE2B0vumcanvmhLy1BTEc4qcUdIidOy3uAaJH06TRkXXAeFUUMBn5v5YHefob78c69YMTRasWv4RzONul__4wAMo2pFCWc7ntSa0cXrhUdPvi0=w2846-h1898-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/f8vKeKVgA8kZjyVJbNlNqq7UcwRNeKMAwToDg1IYp44DQcX_Z0wFBathxGje0bXMhYuwcJGFrCwMHppH17CAiI4TC0oa0U-tAM19uenFR0kFsVQKIk_LDLYOMw0chyfoTAGSnf_fSIJevh3Gd8IeYikPnQi3cOF2As-9pEp1ypaioTacQk51Mt44j5htSMv5L1ZW2KWuAzXNTpwSsbXDYCrQifTPrmgsAKPB3lWQsbTJsvyWbfPyi7FLIK68FprPrfe1W8G1IR7qiy1H7GTN9ZYU1FL8zV9fYsQD4QDggZ10koq39Wv4rAaxI_fMCgn_ju5eUIRchXXPSG9raD63EBCCS2w9Mwzf-EHHbDwaH05QGTKaQXcl42wCJQkRTun8etIIvO9yvW-6m3Lgf_SS1S39vyBx0HtVkVJpOznZ4saUF14y8VbdWRcTnJ4WKyG9rVYjoy1P5yA3ZWT5ZEI0gopb-hvfhcfyqjm2Jatl58VRgUYB3jmKOR3AWarKWCXEAanEUGFikPXs00VvPMKFEUF9d8GAr4zFuuxWIY8kJzWmxStOYVQWnHanizgGjgy-kuvCBV6p0FiPqi6ISJmBLz3YCcdmcglLrrXELuZRGeN2J6KzDA5t5H35uBhOyr4KEZMXmZPIJooDeVfvHFR_sMdiHavXFEySlnRuUmSWcSVplv9t47nDVjF-8_6PfUNW6Gqcw2_OGcdLB4qzfXIFEZbUM-rLKmepp5roKzgo3y3pxk-N=w2844-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/_8PAApq6-cLRRWFcgF_CjQuhCjZFq6SO7S2RX0rL5N_vnmm8-MGbIetNAZamv4INXbln5EAcRc5YQ7CkcEnBFpIgpnzH6nwFgkXwxsdOf2NWJDztISPlum4NwIu4bQKGBOejJwkOTvLA9qzDiIQ9nNDxatIdiBrVQfBmUEeZ8C6om0CRcbxim2FVUQbqTQpPzlg_oe9fVujfh7vZ2FZiCnQIEzLX0Orp4hGZAZHO2lbFpH9mX4CBDC_8cyYSccZUHB1US1o7J98c9ALbzh3RCzvKK1NPYprCpjuAbUgp9dwqswHX0qDIWvu-2kxofgJKgt0lIdwUJYo8kPLtmVXtTYjRLyiYTUmaLDdQXlqxbVJCmP0PkPoxSf7XJNM7_7O-ULF_sGzBYzoAscBGJmF7K5pgWBOWdnjSiNJjStWUS42uiDosmTycOSUaYtB7x6dvtF5DZ_Am1hRXpokodrrEO5KjMkPtEwslFnuvpAPqzpv5l6UehnyfUazapwVQ311SfN5lD9754Lc4arPskZRmn5UVbj3ZqSIidLFHEwZxSmwzRGPlNO55YC9YEJ5jSsy32sqZWRCGOHYI6oYuflI4rVUWGWoNlv0kLJ1cbn7_pZZxAz2S-KEE3YRNTg2KVbkOjPgNKsg8ZC74QJyT41t86-9A4uBKAb0Wp3Ag0MruLg-wsBfr74_26jSROBd1ZpN1A-BPh43HzHqVk1ShgoP5l6FlSF0-rJXDE66NdjAAJxgsZ3g-=w2852-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/kLBpOZhrzJcTdW3wyjOTi7AzxSxdILXqqiAn8ik9vb0DKgVkUQsp-ae0T5fN6jHR7_OYpZ44OSMqXDPv_ACASXgw-R7-VKVy1zzgvsantzhfcHuqAlm9SPhnLs5BGT4HvcNiJdMoQsCNSul8_ijqvxyI3rHUxXGsi48NPfrA-ha7PFaaNGVTRHwqu9LPXsCxZQXPKPn1oI5OTEyizHSOaf3G2wjWaPcwnEQYNwGFi89s7hOCK9D3jOntj9fxHeKo-7B3vLh0teRc2gYG0lzb4upUSRQTnDBmXCebYDu1rApDYM4iWKsLcwSls8eQS97yQaAcypAQftcgrIcRp7a7y1pJARepSXY1yYgo1qOyOHHQJnJ-3CkK7fCr3QXqFoncM-lFCxgvHKSNkG3Dp77kzyhdera3jLkwkwA9ZUdSC9DNLlt8ulPmXcj6WPF9rroWQqP9JGzZbzhwhe5m4rjX6udLqSbkbmWjO7xV39dTnq8-vtCFSmcxWjvjFA9rihoGTL04y8R_1gvDwvaG7gXNLzOWSnHmCUW5cdDDAftxi_QNYyuIpm_vAD_kSHpME0fS_SWOlqsiQxXBDls6N1V-V5oPfEufn_dUkHwuGlpQn36D4MAVGRD9QlRnBBjYhtZmOJb1KorrmDbFi6KcIqbOO9Ja1uoE0nleiAasKu84NAdDrHBUK70ffdUBgzvAAlzhbGbYdei5NSAbw1E_AqqEVVPTqA=w1100-h733-no")
        )

        return ListResponseModel(items)
    }

    override fun getTeam(): ListResponseModel<TeamMemberModel> {
        return ListResponseModel(teamMemberList)
    }

    override fun getSocialLinks(): ListResponseModel<SocialLinkModel> {
        return ListResponseModel(socialLinkList)
    }

}
