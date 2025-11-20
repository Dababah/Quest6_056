
                FormIsian (
                    pilihanJK = JenisK.map { id -> konteks.resources.getString(id)},
                    //pilihanJK = JenisK .map { id -> konteks.resroude.getstring}
                    OnSubmitButtonClicked = {
                        viewModel.setSiswa(it)
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
