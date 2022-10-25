package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class RecommendationResource extends Entity implements Parsable {
    /** The addedDateTime property */
    private OffsetDateTime _addedDateTime;
    /** The additionalDetails property */
    private java.util.List<KeyValue> _additionalDetails;
    /** The apiUrl property */
    private String _apiUrl;
    /** The displayName property */
    private String _displayName;
    /** The owner property */
    private String _owner;
    /** The portalUrl property */
    private String _portalUrl;
    /** The rank property */
    private Integer _rank;
    /** The recommendationId property */
    private String _recommendationId;
    /** The resourceType property */
    private String _resourceType;
    /** The status property */
    private RecommendationStatus _status;
    /**
     * Instantiates a new recommendationResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RecommendationResource() {
        super();
        this.setOdataType("#microsoft.graph.recommendationResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recommendationResource
     */
    @javax.annotation.Nonnull
    public static RecommendationResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecommendationResource();
    }
    /**
     * Gets the addedDateTime property value. The addedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAddedDateTime() {
        return this._addedDateTime;
    }
    /**
     * Gets the additionalDetails property value. The additionalDetails property
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getAdditionalDetails() {
        return this._additionalDetails;
    }
    /**
     * Gets the apiUrl property value. The apiUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApiUrl() {
        return this._apiUrl;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RecommendationResource currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("addedDateTime", (n) -> { currentObject.setAddedDateTime(n.getOffsetDateTimeValue()); });
            this.put("additionalDetails", (n) -> { currentObject.setAdditionalDetails(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
            this.put("apiUrl", (n) -> { currentObject.setApiUrl(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("owner", (n) -> { currentObject.setOwner(n.getStringValue()); });
            this.put("portalUrl", (n) -> { currentObject.setPortalUrl(n.getStringValue()); });
            this.put("rank", (n) -> { currentObject.setRank(n.getIntegerValue()); });
            this.put("recommendationId", (n) -> { currentObject.setRecommendationId(n.getStringValue()); });
            this.put("resourceType", (n) -> { currentObject.setResourceType(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(RecommendationStatus.class)); });
        }};
    }
    /**
     * Gets the owner property value. The owner property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this._owner;
    }
    /**
     * Gets the portalUrl property value. The portalUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPortalUrl() {
        return this._portalUrl;
    }
    /**
     * Gets the rank property value. The rank property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRank() {
        return this._rank;
    }
    /**
     * Gets the recommendationId property value. The recommendationId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecommendationId() {
        return this._recommendationId;
    }
    /**
     * Gets the resourceType property value. The resourceType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceType() {
        return this._resourceType;
    }
    /**
     * Gets the status property value. The status property
     * @return a recommendationStatus
     */
    @javax.annotation.Nullable
    public RecommendationStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("addedDateTime", this.getAddedDateTime());
        writer.writeCollectionOfObjectValues("additionalDetails", this.getAdditionalDetails());
        writer.writeStringValue("apiUrl", this.getApiUrl());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("portalUrl", this.getPortalUrl());
        writer.writeIntegerValue("rank", this.getRank());
        writer.writeStringValue("recommendationId", this.getRecommendationId());
        writer.writeStringValue("resourceType", this.getResourceType());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the addedDateTime property value. The addedDateTime property
     * @param value Value to set for the addedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._addedDateTime = value;
    }
    /**
     * Sets the additionalDetails property value. The additionalDetails property
     * @param value Value to set for the additionalDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalDetails(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this._additionalDetails = value;
    }
    /**
     * Sets the apiUrl property value. The apiUrl property
     * @param value Value to set for the apiUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApiUrl(@javax.annotation.Nullable final String value) {
        this._apiUrl = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the owner property value. The owner property
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final String value) {
        this._owner = value;
    }
    /**
     * Sets the portalUrl property value. The portalUrl property
     * @param value Value to set for the portalUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPortalUrl(@javax.annotation.Nullable final String value) {
        this._portalUrl = value;
    }
    /**
     * Sets the rank property value. The rank property
     * @param value Value to set for the rank property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRank(@javax.annotation.Nullable final Integer value) {
        this._rank = value;
    }
    /**
     * Sets the recommendationId property value. The recommendationId property
     * @param value Value to set for the recommendationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecommendationId(@javax.annotation.Nullable final String value) {
        this._recommendationId = value;
    }
    /**
     * Sets the resourceType property value. The resourceType property
     * @param value Value to set for the resourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceType(@javax.annotation.Nullable final String value) {
        this._resourceType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final RecommendationStatus value) {
        this._status = value;
    }
}
