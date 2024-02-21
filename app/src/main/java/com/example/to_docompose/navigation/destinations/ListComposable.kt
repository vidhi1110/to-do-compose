package com.example.to_docompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.to_docompose.ui.screens.ListScreen
import com.example.to_docompose.util.Constants.LIST_ARGUMENT_KEY
import com.example.to_docompose.util.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit
) {
    composable(
        LIST_SCREEN,
        listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        }),
    ) {
        ListScreen(navigateToTaskScreen)
    }
}