package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEventPresenterDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Bio of the presenter.
     */
    private ItemBody bio;
    /**
     * The presenter's company name.
     */
    private String company;
    /**
     * The presenter's job title.
     */
    private String jobTitle;
    /**
     * The presenter's LinkedIn profile URL.
     */
    private String linkedInProfileWebUrl;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The presenter's personal website URL.
     */
    private String personalSiteWebUrl;
    /**
     * The presenter's Twitter profile URL.
     */
    private String twitterProfileWebUrl;
    /**
     * Instantiates a new virtualEventPresenterDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEventPresenterDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEventPresenterDetails
     */
    @javax.annotation.Nonnull
    public static VirtualEventPresenterDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventPresenterDetails();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the bio property value. Bio of the presenter.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBio() {
        return this.bio;
    }
    /**
     * Gets the company property value. The presenter's company name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompany() {
        return this.company;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("bio", (n) -> { this.setBio(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("company", (n) -> { this.setCompany(n.getStringValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("linkedInProfileWebUrl", (n) -> { this.setLinkedInProfileWebUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("personalSiteWebUrl", (n) -> { this.setPersonalSiteWebUrl(n.getStringValue()); });
        deserializerMap.put("twitterProfileWebUrl", (n) -> { this.setTwitterProfileWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the jobTitle property value. The presenter's job title.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the linkedInProfileWebUrl property value. The presenter's LinkedIn profile URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLinkedInProfileWebUrl() {
        return this.linkedInProfileWebUrl;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the personalSiteWebUrl property value. The presenter's personal website URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalSiteWebUrl() {
        return this.personalSiteWebUrl;
    }
    /**
     * Gets the twitterProfileWebUrl property value. The presenter's Twitter profile URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTwitterProfileWebUrl() {
        return this.twitterProfileWebUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("bio", this.getBio());
        writer.writeStringValue("company", this.getCompany());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("linkedInProfileWebUrl", this.getLinkedInProfileWebUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("personalSiteWebUrl", this.getPersonalSiteWebUrl());
        writer.writeStringValue("twitterProfileWebUrl", this.getTwitterProfileWebUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the bio property value. Bio of the presenter.
     * @param value Value to set for the bio property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBio(@javax.annotation.Nullable final ItemBody value) {
        this.bio = value;
    }
    /**
     * Sets the company property value. The presenter's company name.
     * @param value Value to set for the company property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompany(@javax.annotation.Nullable final String value) {
        this.company = value;
    }
    /**
     * Sets the jobTitle property value. The presenter's job title.
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the linkedInProfileWebUrl property value. The presenter's LinkedIn profile URL.
     * @param value Value to set for the linkedInProfileWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLinkedInProfileWebUrl(@javax.annotation.Nullable final String value) {
        this.linkedInProfileWebUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the personalSiteWebUrl property value. The presenter's personal website URL.
     * @param value Value to set for the personalSiteWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalSiteWebUrl(@javax.annotation.Nullable final String value) {
        this.personalSiteWebUrl = value;
    }
    /**
     * Sets the twitterProfileWebUrl property value. The presenter's Twitter profile URL.
     * @param value Value to set for the twitterProfileWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTwitterProfileWebUrl(@javax.annotation.Nullable final String value) {
        this.twitterProfileWebUrl = value;
    }
}
