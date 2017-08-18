# Pre-work - **ToDoApp**

**ToDoApp** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: Sidharth Jhawar

Time spent: **3** hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [x] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://imgur.com/EZaN2Ry.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** I have always been a fan of android as a user and the fact that android is such a user friendly platform motivated me to start working on Android as a hobby and may be as a professional. I have never worked on app development before so this is very new to me and exciting as well.
I liked how android app development provides so much of the basic functionalities that one can create beginner level apps but at the same time there are so many complicated, high cpu intensive apps that does more than just storing a reminder. Layout and interfaces are pretty much the same as
one would use paper and pen to figure out where all the different elements went.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** Adapters are basically an interface between the two non-conforming or non-standard entities. Here, adapter serves the purpose of acting as a communicator between the data structure(Array) and the interface(device screen). ArrayAdapter is important for the proper User Experience
of the app. The data structure might have changed behind the scenes but if the device/layout does not know the change than it would still show the stale view. 'convertView' parameter in the 'getView' method enables reusability of the current view if possible, if not then we can always
create a new view.

## Notes

Describe any challenges encountered while building the app : 
setDefaultFocus doesnt seem to work with API 26.

## License

    Copyright [2017] [Sidharth Jhawar]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
