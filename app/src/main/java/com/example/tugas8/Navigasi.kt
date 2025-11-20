
            composable(route = Navigasi.Detail.name){
                TampilData(
                    onBackBtnClick = {
                        statusUISiswa =uiState.value,
                        onBackButtonClicked=cancelAndBackToFormulirku(navController)
                    }
                )
            }
        }
    }
}

