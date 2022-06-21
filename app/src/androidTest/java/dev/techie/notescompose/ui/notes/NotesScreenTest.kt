package dev.techie.notescompose.ui.notes

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import dev.techie.notescompose.MainActivity
import dev.techie.notescompose.core.util.TestTags
import dev.techie.notescompose.di.AppModule
import dev.techie.notescompose.ui.Screen
import dev.techie.notescompose.ui.theme.CleanArchitectureNoteAppTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
@UninstallModules(AppModule::class)
class NotesScreenTest {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setup() {
        hiltRule.inject()
        composeTestRule.setContent {
            val navController = rememberNavController()
            CleanArchitectureNoteAppTheme {
                NavHost(
                    navController = navController,
                    startDestination = Screen.NotesScreen.route
                ) {
                    composable(route = Screen.NotesScreen.route) {
                        NotesScreen(navController = navController)
                    }
                }
            }
        }
    }

    @Test
    fun clickToggleOrderSection_isVisible() {
        composeTestRule.onNodeWithTag(TestTags.ORDER_SECTION).assertDoesNotExist()

        composeTestRule.onNodeWithContentDescription("Sort").performClick()
        composeTestRule.onNodeWithTag(TestTags.ORDER_SECTION).assertIsDisplayed()
    }

}