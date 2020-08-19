// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserAccountInformation;
import com.microsoft.graph.models.extensions.ItemAddress;
import com.microsoft.graph.models.extensions.PersonAnniversary;
import com.microsoft.graph.models.extensions.PersonAward;
import com.microsoft.graph.models.extensions.PersonCertification;
import com.microsoft.graph.models.extensions.EducationalActivity;
import com.microsoft.graph.models.extensions.ItemEmail;
import com.microsoft.graph.models.extensions.PersonInterest;
import com.microsoft.graph.models.extensions.LanguageProficiency;
import com.microsoft.graph.models.extensions.PersonName;
import com.microsoft.graph.models.extensions.PersonAnnotation;
import com.microsoft.graph.models.extensions.ItemPatent;
import com.microsoft.graph.models.extensions.ItemPhone;
import com.microsoft.graph.models.extensions.WorkPosition;
import com.microsoft.graph.models.extensions.ProjectParticipation;
import com.microsoft.graph.models.extensions.ItemPublication;
import com.microsoft.graph.models.extensions.SkillProficiency;
import com.microsoft.graph.models.extensions.WebAccount;
import com.microsoft.graph.models.extensions.PersonWebsite;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.UserAccountInformationCollectionResponse;
import com.microsoft.graph.requests.extensions.UserAccountInformationCollectionPage;
import com.microsoft.graph.requests.extensions.ItemAddressCollectionResponse;
import com.microsoft.graph.requests.extensions.ItemAddressCollectionPage;
import com.microsoft.graph.requests.extensions.PersonAnniversaryCollectionResponse;
import com.microsoft.graph.requests.extensions.PersonAnniversaryCollectionPage;
import com.microsoft.graph.requests.extensions.PersonAwardCollectionResponse;
import com.microsoft.graph.requests.extensions.PersonAwardCollectionPage;
import com.microsoft.graph.requests.extensions.PersonCertificationCollectionResponse;
import com.microsoft.graph.requests.extensions.PersonCertificationCollectionPage;
import com.microsoft.graph.requests.extensions.EducationalActivityCollectionResponse;
import com.microsoft.graph.requests.extensions.EducationalActivityCollectionPage;
import com.microsoft.graph.requests.extensions.ItemEmailCollectionResponse;
import com.microsoft.graph.requests.extensions.ItemEmailCollectionPage;
import com.microsoft.graph.requests.extensions.PersonInterestCollectionResponse;
import com.microsoft.graph.requests.extensions.PersonInterestCollectionPage;
import com.microsoft.graph.requests.extensions.LanguageProficiencyCollectionResponse;
import com.microsoft.graph.requests.extensions.LanguageProficiencyCollectionPage;
import com.microsoft.graph.requests.extensions.PersonNameCollectionResponse;
import com.microsoft.graph.requests.extensions.PersonNameCollectionPage;
import com.microsoft.graph.requests.extensions.PersonAnnotationCollectionResponse;
import com.microsoft.graph.requests.extensions.PersonAnnotationCollectionPage;
import com.microsoft.graph.requests.extensions.ItemPatentCollectionResponse;
import com.microsoft.graph.requests.extensions.ItemPatentCollectionPage;
import com.microsoft.graph.requests.extensions.ItemPhoneCollectionResponse;
import com.microsoft.graph.requests.extensions.ItemPhoneCollectionPage;
import com.microsoft.graph.requests.extensions.WorkPositionCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkPositionCollectionPage;
import com.microsoft.graph.requests.extensions.ProjectParticipationCollectionResponse;
import com.microsoft.graph.requests.extensions.ProjectParticipationCollectionPage;
import com.microsoft.graph.requests.extensions.ItemPublicationCollectionResponse;
import com.microsoft.graph.requests.extensions.ItemPublicationCollectionPage;
import com.microsoft.graph.requests.extensions.SkillProficiencyCollectionResponse;
import com.microsoft.graph.requests.extensions.SkillProficiencyCollectionPage;
import com.microsoft.graph.requests.extensions.WebAccountCollectionResponse;
import com.microsoft.graph.requests.extensions.WebAccountCollectionPage;
import com.microsoft.graph.requests.extensions.PersonWebsiteCollectionResponse;
import com.microsoft.graph.requests.extensions.PersonWebsiteCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Profile.
 */
public class Profile extends Entity implements IJsonBackedObject {


    /**
     * The Account.
     * 
     */
    public UserAccountInformationCollectionPage account;

    /**
     * The Addresses.
     * 
     */
    public ItemAddressCollectionPage addresses;

    /**
     * The Anniversaries.
     * 
     */
    public PersonAnniversaryCollectionPage anniversaries;

    /**
     * The Awards.
     * 
     */
    public PersonAwardCollectionPage awards;

    /**
     * The Certifications.
     * 
     */
    public PersonCertificationCollectionPage certifications;

    /**
     * The Educational Activities.
     * 
     */
    public EducationalActivityCollectionPage educationalActivities;

    /**
     * The Emails.
     * 
     */
    public ItemEmailCollectionPage emails;

    /**
     * The Interests.
     * 
     */
    public PersonInterestCollectionPage interests;

    /**
     * The Languages.
     * 
     */
    public LanguageProficiencyCollectionPage languages;

    /**
     * The Names.
     * 
     */
    public PersonNameCollectionPage names;

    /**
     * The Notes.
     * 
     */
    public PersonAnnotationCollectionPage notes;

    /**
     * The Patents.
     * 
     */
    public ItemPatentCollectionPage patents;

    /**
     * The Phones.
     * 
     */
    public ItemPhoneCollectionPage phones;

    /**
     * The Positions.
     * 
     */
    public WorkPositionCollectionPage positions;

    /**
     * The Projects.
     * 
     */
    public ProjectParticipationCollectionPage projects;

    /**
     * The Publications.
     * 
     */
    public ItemPublicationCollectionPage publications;

    /**
     * The Skills.
     * 
     */
    public SkillProficiencyCollectionPage skills;

    /**
     * The Web Accounts.
     * 
     */
    public WebAccountCollectionPage webAccounts;

    /**
     * The Websites.
     * 
     */
    public PersonWebsiteCollectionPage websites;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("account")) {
            final UserAccountInformationCollectionResponse response = new UserAccountInformationCollectionResponse();
            if (json.has("account@odata.nextLink")) {
                response.nextLink = json.get("account@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("account").toString(), JsonObject[].class);
            final UserAccountInformation[] array = new UserAccountInformation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserAccountInformation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            account = new UserAccountInformationCollectionPage(response, null);
        }

        if (json.has("addresses")) {
            final ItemAddressCollectionResponse response = new ItemAddressCollectionResponse();
            if (json.has("addresses@odata.nextLink")) {
                response.nextLink = json.get("addresses@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("addresses").toString(), JsonObject[].class);
            final ItemAddress[] array = new ItemAddress[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ItemAddress.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            addresses = new ItemAddressCollectionPage(response, null);
        }

        if (json.has("anniversaries")) {
            final PersonAnniversaryCollectionResponse response = new PersonAnniversaryCollectionResponse();
            if (json.has("anniversaries@odata.nextLink")) {
                response.nextLink = json.get("anniversaries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("anniversaries").toString(), JsonObject[].class);
            final PersonAnniversary[] array = new PersonAnniversary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PersonAnniversary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            anniversaries = new PersonAnniversaryCollectionPage(response, null);
        }

        if (json.has("awards")) {
            final PersonAwardCollectionResponse response = new PersonAwardCollectionResponse();
            if (json.has("awards@odata.nextLink")) {
                response.nextLink = json.get("awards@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("awards").toString(), JsonObject[].class);
            final PersonAward[] array = new PersonAward[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PersonAward.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            awards = new PersonAwardCollectionPage(response, null);
        }

        if (json.has("certifications")) {
            final PersonCertificationCollectionResponse response = new PersonCertificationCollectionResponse();
            if (json.has("certifications@odata.nextLink")) {
                response.nextLink = json.get("certifications@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("certifications").toString(), JsonObject[].class);
            final PersonCertification[] array = new PersonCertification[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PersonCertification.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            certifications = new PersonCertificationCollectionPage(response, null);
        }

        if (json.has("educationalActivities")) {
            final EducationalActivityCollectionResponse response = new EducationalActivityCollectionResponse();
            if (json.has("educationalActivities@odata.nextLink")) {
                response.nextLink = json.get("educationalActivities@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("educationalActivities").toString(), JsonObject[].class);
            final EducationalActivity[] array = new EducationalActivity[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationalActivity.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            educationalActivities = new EducationalActivityCollectionPage(response, null);
        }

        if (json.has("emails")) {
            final ItemEmailCollectionResponse response = new ItemEmailCollectionResponse();
            if (json.has("emails@odata.nextLink")) {
                response.nextLink = json.get("emails@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("emails").toString(), JsonObject[].class);
            final ItemEmail[] array = new ItemEmail[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ItemEmail.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            emails = new ItemEmailCollectionPage(response, null);
        }

        if (json.has("interests")) {
            final PersonInterestCollectionResponse response = new PersonInterestCollectionResponse();
            if (json.has("interests@odata.nextLink")) {
                response.nextLink = json.get("interests@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("interests").toString(), JsonObject[].class);
            final PersonInterest[] array = new PersonInterest[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PersonInterest.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            interests = new PersonInterestCollectionPage(response, null);
        }

        if (json.has("languages")) {
            final LanguageProficiencyCollectionResponse response = new LanguageProficiencyCollectionResponse();
            if (json.has("languages@odata.nextLink")) {
                response.nextLink = json.get("languages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("languages").toString(), JsonObject[].class);
            final LanguageProficiency[] array = new LanguageProficiency[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), LanguageProficiency.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            languages = new LanguageProficiencyCollectionPage(response, null);
        }

        if (json.has("names")) {
            final PersonNameCollectionResponse response = new PersonNameCollectionResponse();
            if (json.has("names@odata.nextLink")) {
                response.nextLink = json.get("names@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("names").toString(), JsonObject[].class);
            final PersonName[] array = new PersonName[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PersonName.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            names = new PersonNameCollectionPage(response, null);
        }

        if (json.has("notes")) {
            final PersonAnnotationCollectionResponse response = new PersonAnnotationCollectionResponse();
            if (json.has("notes@odata.nextLink")) {
                response.nextLink = json.get("notes@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("notes").toString(), JsonObject[].class);
            final PersonAnnotation[] array = new PersonAnnotation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PersonAnnotation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            notes = new PersonAnnotationCollectionPage(response, null);
        }

        if (json.has("patents")) {
            final ItemPatentCollectionResponse response = new ItemPatentCollectionResponse();
            if (json.has("patents@odata.nextLink")) {
                response.nextLink = json.get("patents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("patents").toString(), JsonObject[].class);
            final ItemPatent[] array = new ItemPatent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ItemPatent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            patents = new ItemPatentCollectionPage(response, null);
        }

        if (json.has("phones")) {
            final ItemPhoneCollectionResponse response = new ItemPhoneCollectionResponse();
            if (json.has("phones@odata.nextLink")) {
                response.nextLink = json.get("phones@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("phones").toString(), JsonObject[].class);
            final ItemPhone[] array = new ItemPhone[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ItemPhone.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            phones = new ItemPhoneCollectionPage(response, null);
        }

        if (json.has("positions")) {
            final WorkPositionCollectionResponse response = new WorkPositionCollectionResponse();
            if (json.has("positions@odata.nextLink")) {
                response.nextLink = json.get("positions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("positions").toString(), JsonObject[].class);
            final WorkPosition[] array = new WorkPosition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkPosition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            positions = new WorkPositionCollectionPage(response, null);
        }

        if (json.has("projects")) {
            final ProjectParticipationCollectionResponse response = new ProjectParticipationCollectionResponse();
            if (json.has("projects@odata.nextLink")) {
                response.nextLink = json.get("projects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("projects").toString(), JsonObject[].class);
            final ProjectParticipation[] array = new ProjectParticipation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ProjectParticipation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            projects = new ProjectParticipationCollectionPage(response, null);
        }

        if (json.has("publications")) {
            final ItemPublicationCollectionResponse response = new ItemPublicationCollectionResponse();
            if (json.has("publications@odata.nextLink")) {
                response.nextLink = json.get("publications@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("publications").toString(), JsonObject[].class);
            final ItemPublication[] array = new ItemPublication[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ItemPublication.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            publications = new ItemPublicationCollectionPage(response, null);
        }

        if (json.has("skills")) {
            final SkillProficiencyCollectionResponse response = new SkillProficiencyCollectionResponse();
            if (json.has("skills@odata.nextLink")) {
                response.nextLink = json.get("skills@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("skills").toString(), JsonObject[].class);
            final SkillProficiency[] array = new SkillProficiency[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SkillProficiency.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            skills = new SkillProficiencyCollectionPage(response, null);
        }

        if (json.has("webAccounts")) {
            final WebAccountCollectionResponse response = new WebAccountCollectionResponse();
            if (json.has("webAccounts@odata.nextLink")) {
                response.nextLink = json.get("webAccounts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("webAccounts").toString(), JsonObject[].class);
            final WebAccount[] array = new WebAccount[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WebAccount.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            webAccounts = new WebAccountCollectionPage(response, null);
        }

        if (json.has("websites")) {
            final PersonWebsiteCollectionResponse response = new PersonWebsiteCollectionResponse();
            if (json.has("websites@odata.nextLink")) {
                response.nextLink = json.get("websites@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("websites").toString(), JsonObject[].class);
            final PersonWebsite[] array = new PersonWebsite[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PersonWebsite.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            websites = new PersonWebsiteCollectionPage(response, null);
        }
    }
}
