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
                pictureUrl = "https://lh3.googleusercontent.com/RwcRMyQKl5in0m0AHX6ucOMq5pD61y2tvmaD4o_ZrDQtihIvkTZAZiQsdY2naYOVA7pfcQcdm1sviZLfG0QnOllzUhY75qOoGeHzc-4LL0xKeiX0842bF5HPaLKa2C1VRXYb30tONiiCZkE5smyItvxJiuKDMr5hp5MZ3QebBgKo3pOX8JdSazugmqdWdC8pqArJLeStCmBlbJmwQ1Puxx4VFTb3uhl7o0zOcTNm-qxmotq3k_V1Kl4bgTUTqhbRt-06hwv-cbWE89jtxOQFqKfVlUi1AAwf5_MtmhO6dQR3Y0OrvprL39Y68Rvx27QHJwDGU_GrVgpw550RxUgeBAiE3Uppt5TVZ7ueZkA2UDPwzmUOMdu5Od5v8p0TEliRDfj9eeNS-ki_gexCAFXoryTfWcLiXiYoVVFxjIY7DZsqMOSBUZsRXdcTYqG13bSUF6Q-aSHSQkPsXyWlX0p8XmuG5s5axwOgSAMy2z7ClpFPvaLONycc3xTNAHkYuZ_PaFRbQAW5g3nqeiPesS8zg3bf8HHL3kbDsaaSfJoMl4O7fOjdYL9-YxJ1Hb4ZmXkPnnAuxPnfoHfINtdwE463qMt_QgN0ecgde53UIOaOfb6y17TJpxAXkBE74XC2EWMiCCIo3GWUDGghQzKYPzIb0WrLr6YpqgBXS-WDL3Dg311ZL1-7bU6wA00XPPqG4PAuSpxFDNKkp-2UXzFjLh0pjmkb2N2nBrZwRUUI3UDkwFTc5csM=s370-no",
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
                pictureUrl = "https://lh3.googleusercontent.com/JlhOiEd32e24zUhurEo0ElCLRE_U0StZNVcfXmBhix9lrjdlwkKM3VyNHyG62ME7vv7yZnvlgg1XXIOAwI1AEkzHgZJuWem2XVVWYTXHe5xtfX5t5Cz2hr6tGNTMknqDJrP03PNLBTchAqucyH81rQCf3ecpV_jzaKwo4jN52AKIMMSfpZqOgwSDFZn_UdwDT4XDtMfCEwTkOIffMB-k1VkwoOkuXZRShW0HTNrB20sFsrdPRRNgQ3KTRRhYl3YBP2x1Y5L18QnxvTtDTjFP2TQzm0Na9rPQvlgyJdFRJArcMd_sVk_Sua1tK-JSyu-IuKNowkce2CmpFje-EPS383RrJGmpWJ4pczAaVZtvy_49XU8r20ASSmtFwtCj6mjFjlJXYzlGy-X1OgstdBnPj6UIMB3KCArCxzc2A86rGOC1Ea8EOjmESRyOSuCWUih8nTZTmdQYNgpi_EIZcQzYcVUi3Qp-LbT98LBYuF2OiosxNn2vv_PPUftGMyLPEK23-ANGPeoZCckQkHpmVeVRG3MpZDUFJ5hKci40lWYI3hUv4lho9WzewKyHOX0P600M82OG-t9_gSblI3svZF-3u0rG1TITKnckbRfrpfmnwBKYc2jwEWI3O5TQ4QBXNRI90qEgaDtzxdJLn7BtnnRoe2nprhn_IUIw4q0nkZf8Xo-zwscePGr5GjWyC_n0LaAY1ejI4TQLxueqY1mWzxNFHBF-1CXB1Tliak8-XS5RysmxhwS5=s400-no",
                shortDescription = "Android & AOSP Developer",
                longDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
                twitterUrl = "https://twitter.com/SimoneFormica",
                linkedinUrl = "https://www.linkedin.com/in/simone-formica-4b464b114/"),
            TeamMemberModel(
                firstname = "Omar",
                lastname = "Al Bukhari",
                pictureUrl = "https://lh3.googleusercontent.com/LoS--B3AZthfDgRFhOecxkaF0abQGu5BJVwpWzP_8_qwHfi6Ct2cs7j8S1qSvgrr6Y4yhl6YY05QmuwUp8b0IEPOuvmDbDd_9fm3vm9H517eHuxjqrmMcp1QcUaEmc0RMVDRbv9pYEHJXiq2AcbCznTzAnxrHNNAysSEN7co98qki6PujUlRdA1qZMXpyzAJVkoufC05FryfZwV6F_Kr4PMTdlnw7UQgsVOoJJFH76bFL8ceJnusza2x8D_OdvYpQ7jZRGy6N2udlyrgfvYGVsQbpUFM9U4WSKLaiRQq6g4IwtkTSyCu8ONTvXvpOFNPxRq7YINg3oRtlr1DQtR0vk8YkFq-_HfTCv3aNjQ1Cy1dPQmZg0JhU9Cl14OpTPv_TwS3MgcQTBAwuuYL_pkV-anHbc2JpZZX9LZxYMKVsRqUwXDh4ofeYRy5_cXkLCHE3NFkcNy-KWGiA0XcCzXPr3Aym891gaM1ASwxuUyYHsneBZZyZwT4wnJ-NLTbbNbAkWeeQ2Rlz8AiIOCDCLMPcFIU31pD4M5uKNxrGfwhwIAP7Xeoj-nCHmnziaYTAOIqOB7PBwooMBO7qzOYFugotBEqyGnSmyf-xw13cfAi6hZgYOzfjPxCyZIcBdc5MF0GKuDOu5cWW2xOGDzXx8OwnVOOjug4DnE5L5Cl3TMSFxHpx1_py1mpOiPG8aFFYROOGF-KWajmBLXkKx43a4GJXJMLjrQtE7hQLyfPTG-9fimB7i-l=s200-no",
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
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/3heZu3juRMYTgitXUXB8uZ93EjldPaqUXkHT6VxcA2C9ip3iudP9QsEfY8Qy8ptybBOhTHo6lco9cOval_HorT74yDMUFRKTtRdY5Grx0yJQyoai-UKVufcwUsEQJtn2GKT1Hzn9pb5Jgc_BmUhfeiiuCZdNanuYkBJVz92JUniv6prOuf12FNbKlIbsT_eVk9sCtK3wUBfURZykQv0gaeJiB3V3y9XUB_bH5x7omGutKibhAqVuKUKSrw43ZNyyQJ34J0vwp_S1-4gObq5pFiUaqjNnbUAGqwWOqR7ACxeaulA0vqaRKs1G0nz7xm8mqx3siUF0ukvqCqXv7_NEcPi1d4QGSmmMPhfUS1BRgUzlqT2yxNpSZ0B-6fBI8D7-4QYWdPRBjsj18hZxdw2iHVIpmKxeSrfVDxc7qSUlnL4M5AAMnCeyQ4OluCE0CZn3gGHhKi6Bp0o_kuL-QWqQCQ7v-m-nKIbUaBjUeHKrfGCE7ORB6ZnDz19Jl3omPZPShFdAN1KAksMNEbCwiDE18n39df_wZw3w__ILdq1UZBzA7dyNZbJb2ujBL2tQ7r7BFzFYH4eq92JDxYzfazUeniMYFn2OiZ9A6WMrQqDEMKB54qQV27sWTKluX3Q-Rx3CY5zTKtS2SIFsp73f5zdYmO3Yav-6ic6-aL3f_Wg3-fBv41wc6fSRhWbJppDH-D7YVXLcRpEk9aYvBqQyz61YrFaYIafRsaQ4iFgmh6dbFJ0W3aDT=w2846-h1898-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/68dwQFQdJNhCXKaqtn6-YM750r8VnFFhvU6CO6KmAOT9txlAkUljCOSLoqvjleiSKxlzGck_n6oXMAzoN4onYiR7sep2iZwh2s2SsNjaVeR89vyK1l8JpJJvNKZaPYc_jDvyDcF2_jKpdWWCoJyuDu0pq0XxzrKLfV9TkU6YJ1bwYRyPkQBIC9lX9oeo0_ra5EoP-8QF_OtQRbTpL0z31puAl5uU1YSbQxOj9jC6gDmAJ8UKcMstE7QZzngzQPkXsqlTM3ItwAwGc0SNtFiQeIdQOuPXuVqGYbm19tJoEDn-NpobjQ9Nt0lWZ2Wwq8JfTkk43evj7imlghaqWtVPXw2O2rKLvUivaYzu49bOIZICYfg56Hb-diFHZ_LkLuqw1_RZyuVm1RCYNBCODxnXwsII_ZFEpJC47PYOPpTqY3LrhWd5BcmcQ2hWd9O_bBqQbQs4vkp8U6I487l8LcKIKGqITp27rdYqUxjyO2kNuwrjkBp9djjUzF94JChYTstUv5NS-Ggjc7KaJ_fXQ0D4F51GalqDYbnJd6ZQ25ZsPgmtiOKYkr5X5sbTvqWlSoxvSgDMu1d7rFjlI7lJ4-hGeYvRxS6x3MCheOkFEzQH2keGjEHEJRMOK_inIi8V-PyZFTp8Vf4yAa4x0qUXw0soZqcWbQHrsg2mxzVE26F1MW6aYgKnyhgdk5x8tc1mUGJv_ipUASFx92VQ9OLeHIWaSgkhG63sU-PPfeTuHwlWZaz7AEB-Uw=w3360-h1890-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/QA1HbKvda8_ZqO_SaPwXyUT2lcd50yfXRvJ672VYWMZTD6BdciY3_GJ8cTdymAgjSFVT-vQMS4lqSUsLVtG5DtNQ_t8CdaEp_BiOoFQU8TnUj_-H0QTYew5jc3iJBrHlBoF2hB70bMib_ThTGum7zvByhC3JmslpxtibWerzfel_mmNP5QW1Z1P8jzNQy5g1QN1JQFVeEvsvOEyQU9bJ-UQFrc_3r3rOuuN5r0_uyaTm9c8ojmVHaBo8K2-FdsxMyoZEYhpM1JhZsOWp2kXCn2upv2uAD0m69HN4NHWH6yKMmReVUAhtGRSEOtunovA7pbvPwBHkERkG0kA_-zab-R7mw5J9W4wh3szuv9tJZEfsT0jlgoHytYh4jVM6oCtKrMuIYFiNdNuU189GjiioeIcyc-TD2aVP-6-ZIGm98eSJ9XEHNvJIwcjvAn7_JoDPGn77uEZctZQUwQV2oAQLeWPyckrhy7cl0Dw-hGvPeU2_6I_tskX0-NB4aStjexRtxJ1vpBgkgf2ByAsQ2ildlcLGQLctKNZvrpq0EkDE-R_2Sx-UozmCIVdIwcpE1vZkM-j05IPxsbYqadBEyVcGUOgZxZ0THAo8F8ou8KnABV4kgYB-mZ7Ofu2GdBVB3Soa9GR080etj6zNlkYCaj2XNHUVwBfa8e20iqep3RMIAmkZhBgx1nVP9KBnVfTQDypD8-b4qMdACyotD0EmadHj0teVr-n553Mm6DUmZKRrZyuUQj4CpQ=w2844-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/XHZj22x-DhTgHFi_jXWCdQb1fTTW7rKRpQxOoZFNmYi6ahNFl1YGl9Ub9j2NRHfirpl1usM7eruW1xUrMjFDepiZIF2genC3cyMsn0n10UH__bWKUnQlnTyyjJEaLECIESaKTtTq0Ih0u_mNbf6kR_K8CfSr98LSFksLzaCwY0R72-AGDh3xqtfy2N-8ApwMo5IIf1TE2wulj2XgFmY9C3_-VQLjdZ-ABZbdbT8qVGEiWkLNSS1XXi5GslizbmD9_q0XFLwh6D4Zy2X5_Jvb3HOaSj_KeoZxS4dZDuHw9zNQ9tEftk8svgScxj_HbzaGilybfgVLKkLbQFQLdfWJncwCrnQTwb0HerA7xK-gDcXm5icyZl076z1UkTJw-W6iOWsuX0OFVlCXSCRkT_nnFIAYclgeKbN_A6KvWsdHHQprmtFkw_585EJQsMMzQX0cqJt819pEj5Dc5Uqp8fe0QVBwfRN_gQE-91DkM7SzrIoNk9oJRip_Z-gvraN86owrsSKjdUW0Nh_DcozWAoq7ApM9yqG2msi1iQ1nxQEREYHFrTiYnLJWqCAhNH83ILY8HQ3ofkYXDB22PY6VbQ0jWvywmnmpcB3A31iGcYlG5IF636qhgWeTqFagDdGimVV7MRQUPx9h9KHG0RP5eAGPpuI3lDW5fX21dkL06UgRypFHS9sDwgclJ-pTr2-uJeTduzxZEE-AakMggSHFzuz4W0rdvEuYuNTSYMlfl7m_IiP1lain=w1422-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/D7LufQ9yZWZjNtY3am40NWyLqNAYSrb2iASKHKZcxWnbhN39HCqT5MSMPvtvvv0lm5VDUD0T7OdnCnW2yksOJzCKgq6NVByJWktuGNe5w8-DI8TdxygF7BQ2Qjfocs5tt2OD25FeQihde7nEJEadKuwnyEHnukh3i-K8M_Rz7UG4n8232_OZAb0VxyrLrsJuMHzLuuk9BOxWmJ-8cvssYdRzcaBp6ogffwjg8t2qge1x6Jumaiz9YvPLBjPt9QN_s39WRKGZwxSQqfEJYQ9d1bL5PfaMh6eRDvGGoD5TPuS4E-y3ywkXvmC5TIRx0d2GasCiCt1NFbVpyHthtsqNfnCSPHCVOvlSMld9HRKsa0wHApZzrfA_Yp-JevOxAwe3oolGaJttgJjaldqdnlyEl5Z8c2Pt3MlS1vL-E-Bqk3hGN6kKbHxVBWoWHpw6JX2T3z1zj7KG4fdhGiwyhsztxchsQG_eej8KqiYOz-TRyFm2Zw06d--HZOidQfRktDgMXBdLRImR0mhpYVoZ4cQl8FMHJTTOVwy74s9zkiHnLg_pJzAJ0BPD0PS1-CedZUuwfbKpukhWC5Od8L5t85Tr4Tckv35opXFhM3bEYMKlZXTXBE0wgBCcfjetwCrEm5oT8sDUt6lWXxvmG8hWOsCDicGfCdL2jSEntyVchT6sY-6q6GRI5r9kbTSlu1dIkfYCn6YAanXVxiE3WaKVMocdOOjT-zYOhiFcHbFozwzlesaWz2VrEA=w2844-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/q52p5by4-wo-CzLzDbNpE1WBYlzvhBEVS0esYne5Ku6ZGLdpLM_ZpnggClmREBmmJwxRTxFQrcVv3KdbPwlDsMnusttkO5LSUmIrO1kvy0e1o3-ZtDx2v5WrT_2D1EJGRD15qAiBgJgTZMX7If2udLKlp9JlLsBSgpp28XGbyr0-hRP-J0zQF1PrA4A3vp7RPUNVp-SwYgY3if0Cg9fgdZgslpJZNYxexml_EfNMyQoZEaiUUOtJO--KIF5Hq5vxwT_68zWqNBfpMQnXw0nAw2Q-LGmqvmdwsVQy8ZEUk4OACFouYmlRCJBy7BixkUXyIHfylLsXki2yEWpEjJru1fu-ksHJvLC4sbBcMt0NjPZtQ32hUIAGaikK9X6V3qUDqGjkqfLBiN6dcPjTNUxn60Z83ed5CLuqOGRa0JG0BMlwtJhkKoYkP1ZNkQIzyhx3vu9zNuFyJ21UcO6kYat2n_Z85Pjc6Gk9PjCmKor4ydOHGcB2BOQcGl8B2QSijcImTS64q2Vy_5jfyv_4Iyg7MgJW1_CHFPkBT_5I-7fIK9n8i8T7tQPiWiNm-idCqqbOTcKJiD18hRHHk9UC6u4eoTZNN3XUJyRFICgIpCBgi5KdJzsYn15oLgMUWf-jqdmP9v7z1QFDzuEtvGSkLOyFWuCH_rLyoYV9V9dLDUTm94JQ5ZYEyWev-7Z_At_dF36DI0bIS-XtG0oN3CRA_VtmRaQFtfINaMznyucwehpeC-JV7zIyhQ=w2844-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/45TE8szN3SD3xZlUIL2MLrmg1SlmMM2AU2sPgAgbCn2_542NBPNjJFNemEVReetJCH5DwioJNqEjqKUKIHRGrVdhTwYv6T2l-KlINa3lfuO1n5JfodUfNbRxX0R4KQ7PF-IMLrTR574pc5U84oSU-F8nJSbC5lvRDNulgslFsxYRppNVpi1vZBN7sP86xm7FwnDNxhM3nqTqP1gRDLFTeHdK0GCmrUQdLnaQL6gusZGIQzgtkjnWa-Etjf88-uPDMTVlhYg_aLiY-pCUYptXdsUM-hckkW3G_P_-NiHVI3wCP9mYwAQX53R-nK230B9Z6b5ys_1M9o88AxMqBRHzO2WV19H4Zxhx7awSI3EP1itXE2IgdLhUMXHuryFi_JJu8X1qEcp_S_-h-JqzUI_nvvl1EgwmP_pcpK9qzk_4h-ZXFqbAEyr_csXw7v5Oq7KqZfHGpZV4tDU1FhbjWrA5nenhMBBIvQK3PntBa2ROzxeCLNJwkcqzkR4IZ4JszHfvUkMaPUSHIGoYgRc4w7fXoPFwJlRTEqsBnxGy_Yc4Z0x6xJiO3Ek7rjAXAJkR0jvD7ifsc6OwxiVJSvyKk2-jyRBHwhUHucCmuz828MELaEFl2-bJF3fkybVoiOspq9GrmIIE2B0vumcanvmhLy1BTEc4qcUdIidOy3uAaJH06TRkXXAeFUUMBn5v5YHefob78c69YMTRasWv4RzONul__4wAMo2pFCWc7ntSa0cXrhUdPvi0=w2846-h1898-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/f8vKeKVgA8kZjyVJbNlNqq7UcwRNeKMAwToDg1IYp44DQcX_Z0wFBathxGje0bXMhYuwcJGFrCwMHppH17CAiI4TC0oa0U-tAM19uenFR0kFsVQKIk_LDLYOMw0chyfoTAGSnf_fSIJevh3Gd8IeYikPnQi3cOF2As-9pEp1ypaioTacQk51Mt44j5htSMv5L1ZW2KWuAzXNTpwSsbXDYCrQifTPrmgsAKPB3lWQsbTJsvyWbfPyi7FLIK68FprPrfe1W8G1IR7qiy1H7GTN9ZYU1FL8zV9fYsQD4QDggZ10koq39Wv4rAaxI_fMCgn_ju5eUIRchXXPSG9raD63EBCCS2w9Mwzf-EHHbDwaH05QGTKaQXcl42wCJQkRTun8etIIvO9yvW-6m3Lgf_SS1S39vyBx0HtVkVJpOznZ4saUF14y8VbdWRcTnJ4WKyG9rVYjoy1P5yA3ZWT5ZEI0gopb-hvfhcfyqjm2Jatl58VRgUYB3jmKOR3AWarKWCXEAanEUGFikPXs00VvPMKFEUF9d8GAr4zFuuxWIY8kJzWmxStOYVQWnHanizgGjgy-kuvCBV6p0FiPqi6ISJmBLz3YCcdmcglLrrXELuZRGeN2J6KzDA5t5H35uBhOyr4KEZMXmZPIJooDeVfvHFR_sMdiHavXFEySlnRuUmSWcSVplv9t47nDVjF-8_6PfUNW6Gqcw2_OGcdLB4qzfXIFEZbUM-rLKmepp5roKzgo3y3pxk-N=w2844-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/_8PAApq6-cLRRWFcgF_CjQuhCjZFq6SO7S2RX0rL5N_vnmm8-MGbIetNAZamv4INXbln5EAcRc5YQ7CkcEnBFpIgpnzH6nwFgkXwxsdOf2NWJDztISPlum4NwIu4bQKGBOejJwkOTvLA9qzDiIQ9nNDxatIdiBrVQfBmUEeZ8C6om0CRcbxim2FVUQbqTQpPzlg_oe9fVujfh7vZ2FZiCnQIEzLX0Orp4hGZAZHO2lbFpH9mX4CBDC_8cyYSccZUHB1US1o7J98c9ALbzh3RCzvKK1NPYprCpjuAbUgp9dwqswHX0qDIWvu-2kxofgJKgt0lIdwUJYo8kPLtmVXtTYjRLyiYTUmaLDdQXlqxbVJCmP0PkPoxSf7XJNM7_7O-ULF_sGzBYzoAscBGJmF7K5pgWBOWdnjSiNJjStWUS42uiDosmTycOSUaYtB7x6dvtF5DZ_Am1hRXpokodrrEO5KjMkPtEwslFnuvpAPqzpv5l6UehnyfUazapwVQ311SfN5lD9754Lc4arPskZRmn5UVbj3ZqSIidLFHEwZxSmwzRGPlNO55YC9YEJ5jSsy32sqZWRCGOHYI6oYuflI4rVUWGWoNlv0kLJ1cbn7_pZZxAz2S-KEE3YRNTg2KVbkOjPgNKsg8ZC74QJyT41t86-9A4uBKAb0Wp3Ag0MruLg-wsBfr74_26jSROBd1ZpN1A-BPh43HzHqVk1ShgoP5l6FlSF0-rJXDE66NdjAAJxgsZ3g-=w2852-h1896-no"),
            PhotoModel(title = "DevFest 2018", tags = listOf("devfest"), url = "https://lh3.googleusercontent.com/2FK30qf4nUfA4PLGYnejKzQMRamvu51VAfxL8anjLJ1MVbxME3hEikdSb9ABRqn4SjmK9IuXDRms6k6qO7zu2zdMTYVRICXpubbiLwvdeqR-BsMG2CbrWqw315wFPXrW-pKceC_5mcjZ7rkIj_aPqRtmsQDPFzJSLllrwzwNCuiopilrLXCfa6mnAK5GeWGbUaG7oFcvOKCWAwJL6v_2e28eB5-SBPRhiMHn5YaN5hOVVEm1LNoyGv4UIltwASgUgeURUACk0RpaCEr13J63RHmXD78KZNrTCCGP7i3MN-RKPNJ0ZqO5Y58S4YRyxvKBKANHGNjrA_GqoVoSyjyvEinio53GDOsF5DEzGCiQ2xzidMeOU_IW4ND3gUcfqt7hqqIzFDDQyWRSX2V3jbn3SqGYo4W54Dl79ZbcUBirjdz1zRu9S0BG09wta39UFzSI1xK4Ce5vJYf-OuDPRd-IRvRcV2129NkLWvBZoTu3i4XlXDM6y-xIPaYiHsZ04r8qZVxLO2z8IAxySd-jctbt0ZIFDrUdNvLABtyiCVPEqq6gwJUDqhrH3gXyjMFipFWgA5-iXTjia9QJU5qX3miFw5zmgpmafGV0gvfkTkaOplD-j3fTfVzMrDVhtiUt1BWetbjzymt2zsajjAF4lPeA--Z21kZZZGqiTjVvxva_-WYVBSM7QQVvESHMHMcSSSCG_EflEdsx0Kwxy1KCkee5M_SxizIx00W_cIcptCLDDJmpsOui=w2528-h1898-no")
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
