package com.duyp.architecture.mvvm.injection.ui_modules;

import com.duyp.architecture.mvvm.ui.modules.feed.FeedFragment;
import com.duyp.architecture.mvvm.ui.modules.feed.FeedModule;
import com.duyp.architecture.mvvm.ui.modules.issue.detail.IssueDetailActivity;
import com.duyp.architecture.mvvm.ui.modules.issue.detail.IssueDetailActivityModule;
import com.duyp.architecture.mvvm.ui.modules.login.LoginActivity;
import com.duyp.architecture.mvvm.ui.modules.login.LoginActivityModule;
import com.duyp.architecture.mvvm.ui.modules.main.MainActivity;
import com.duyp.architecture.mvvm.ui.modules.main.MainActivityModule;
import com.duyp.architecture.mvvm.ui.modules.main.ProfileActivityModule;
import com.duyp.architecture.mvvm.ui.modules.profile.ProfileActivity;
import com.duyp.architecture.mvvm.ui.modules.profile.followers.ProfileFollowersFragment;
import com.duyp.architecture.mvvm.ui.modules.profile.followers.ProfileFollowersFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.profile.following.ProfileFollowingFragment;
import com.duyp.architecture.mvvm.ui.modules.profile.following.ProfileFollowingFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.profile.overview.OverviewFragment;
import com.duyp.architecture.mvvm.ui.modules.profile.overview.OverviewFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.profile.starred.StarredFragment;
import com.duyp.architecture.mvvm.ui.modules.profile.starred.StarredFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.RepoDetailActivity;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.RepoDetailActivityModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.RepoCodePagerFragment;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.RepoCodePagerFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.codeviewer.CodeViewerActivity;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.codeviewer.CodeViewerActivityModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.commit.CommitsFragment;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.commit.CommitsFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.contributors.ContributorsFragment;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.contributors.ContributorsFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.files.RepoFilesFragment;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.files.RepoFilesFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.files.paths.RepoFilePathsFragment;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.files.paths.RepoFilePathsModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.prettifier.ViewerFragment;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.prettifier.ViewerFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.release.ReleasesFragment;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.code.release.ReleasesFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.issues.RepoIssuesPagerFragment;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.issues.RepoIssuesPagerFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.issues.list.RepoIssuesFragment;
import com.duyp.architecture.mvvm.ui.modules.repo.detail.issues.list.RepoIssuesFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.repo.list.RepoListFragment;
import com.duyp.architecture.mvvm.ui.modules.repo.list.RepoListFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.search.RepoSearchFragment;
import com.duyp.architecture.mvvm.ui.modules.search.RepoSearchFragmentModule;
import com.duyp.architecture.mvvm.ui.modules.search.SearchActivity;
import com.duyp.architecture.mvvm.ui.modules.search.SearchActivityModule;
import com.duyp.architecture.mvvm.ui.modules.splash.SplashActivity;
import com.duyp.architecture.mvvm.ui.modules.splash.SplashActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by duypham on 10/19/17.
 *
 */

@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity loginActivity();

    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity splashActivity();

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector(modules = ProfileActivityModule.class)
    abstract ProfileActivity profileActivity();

    @ContributesAndroidInjector(modules = FeedModule.class)
    abstract FeedFragment feedFragment();

    @ContributesAndroidInjector(modules = OverviewFragmentModule.class)
    abstract OverviewFragment overviewFragment();


    @ContributesAndroidInjector(modules = RepoListFragmentModule.class)
    abstract RepoListFragment repoListFragment();

    @ContributesAndroidInjector(modules = ProfileFollowingFragmentModule.class)
    abstract ProfileFollowingFragment profileFollowFragment();

    @ContributesAndroidInjector(modules = ProfileFollowersFragmentModule.class)
    abstract ProfileFollowersFragment profileFollowersFragment();

    @ContributesAndroidInjector(modules = StarredFragmentModule.class)
    abstract StarredFragment starredFragment();

    @ContributesAndroidInjector(modules = RepoDetailActivityModule.class)
    abstract RepoDetailActivity repoDetailActivity();

    @ContributesAndroidInjector(modules = ViewerFragmentModule.class)
    abstract ViewerFragment viewerFragment();

    @ContributesAndroidInjector(modules = RepoCodePagerFragmentModule.class)
    abstract RepoCodePagerFragment repoCodePagerFragment();

    @ContributesAndroidInjector(modules = RepoIssuesPagerFragmentModule.class)
    abstract RepoIssuesPagerFragment repoIssuesPagerFragment();

    @ContributesAndroidInjector(modules = RepoIssuesFragmentModule.class)
    abstract RepoIssuesFragment issuesFragment();

    @ContributesAndroidInjector(modules = IssueDetailActivityModule.class)
    abstract IssueDetailActivity issueDetailPagerActivity();

    @ContributesAndroidInjector(modules = ContributorsFragmentModule.class)
    abstract ContributorsFragment contributorsFragment();

    @ContributesAndroidInjector(modules = ReleasesFragmentModule.class)
    abstract ReleasesFragment releasesFragment();

    @ContributesAndroidInjector(modules = CommitsFragmentModule.class)
    abstract CommitsFragment commitsFragment();

    @ContributesAndroidInjector(modules = RepoSearchFragmentModule.class)
    abstract RepoSearchFragment repoSearchFragment();

    @ContributesAndroidInjector(modules = SearchActivityModule.class)
    abstract SearchActivity searchActivity();

    @ContributesAndroidInjector(modules = RepoFilePathsModule.class)
    abstract RepoFilePathsFragment repoFilePathsFragment();

    @ContributesAndroidInjector(modules = RepoFilesFragmentModule.class)
    abstract RepoFilesFragment repoFilesFragment();

    @ContributesAndroidInjector(modules = CodeViewerActivityModule.class)
    abstract CodeViewerActivity codeViewerActivity();

}
