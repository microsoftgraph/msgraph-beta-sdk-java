package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImpactedResource extends Entity implements Parsable {
    /**
     * The date and time when the impactedResource object was initially associated with the recommendation.
     */
    private OffsetDateTime addedDateTime;
    /**
     * Additional information unique to the impactedResource to help contextualize the recommendation.
     */
    private java.util.List<KeyValue> additionalDetails;
    /**
     * The URL link to the corresponding Azure AD resource.
     */
    private String apiUrl;
    /**
     * Friendly name of the Azure AD resource.
     */
    private String displayName;
    /**
     * Name of the user or service that last updated the status.
     */
    private String lastModifiedBy;
    /**
     * The date and time when the status was last updated.
     */
    private String lastModifiedDateTime;
    /**
     * The user responsible for maintaining the resource.
     */
    private String owner;
    /**
     * The URL link to the corresponding Azure AD portal page of the resource.
     */
    private String portalUrl;
    /**
     * The future date and time when the status of a postponed impactedResource will be active again.
     */
    private OffsetDateTime postponeUntilDateTime;
    /**
     * Indicates the importance of the resource. A resource with a rank equal to 1 is of the highest importance.
     */
    private Integer rank;
    /**
     * The unique identifier of the recommendation that the resource is associated with.
     */
    private String recommendationId;
    /**
     * Indicates the type of Azure AD resource. Examples include user, application.
     */
    private String resourceType;
    /**
     * The status property
     */
    private RecommendationStatus status;
    /**
     * The related unique identifier, depending on the resourceType. For example, this property is set to the applicationId if the resourceType is an application.
     */
    private String subjectId;
    /**
     * Instantiates a new impactedResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ImpactedResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a impactedResource
     */
    @javax.annotation.Nonnull
    public static ImpactedResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImpactedResource();
    }
    /**
     * Gets the addedDateTime property value. The date and time when the impactedResource object was initially associated with the recommendation.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAddedDateTime() {
        return this.addedDateTime;
    }
    /**
     * Gets the additionalDetails property value. Additional information unique to the impactedResource to help contextualize the recommendation.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getAdditionalDetails() {
        return this.additionalDetails;
    }
    /**
     * Gets the apiUrl property value. The URL link to the corresponding Azure AD resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApiUrl() {
        return this.apiUrl;
    }
    /**
     * Gets the displayName property value. Friendly name of the Azure AD resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedDateTime", (n) -> { this.setAddedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("additionalDetails", (n) -> { this.setAdditionalDetails(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("apiUrl", (n) -> { this.setApiUrl(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("portalUrl", (n) -> { this.setPortalUrl(n.getStringValue()); });
        deserializerMap.put("postponeUntilDateTime", (n) -> { this.setPostponeUntilDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("rank", (n) -> { this.setRank(n.getIntegerValue()); });
        deserializerMap.put("recommendationId", (n) -> { this.setRecommendationId(n.getStringValue()); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RecommendationStatus.class)); });
        deserializerMap.put("subjectId", (n) -> { this.setSubjectId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Name of the user or service that last updated the status.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the status was last updated.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the owner property value. The user responsible for maintaining the resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this.owner;
    }
    /**
     * Gets the portalUrl property value. The URL link to the corresponding Azure AD portal page of the resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPortalUrl() {
        return this.portalUrl;
    }
    /**
     * Gets the postponeUntilDateTime property value. The future date and time when the status of a postponed impactedResource will be active again.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPostponeUntilDateTime() {
        return this.postponeUntilDateTime;
    }
    /**
     * Gets the rank property value. Indicates the importance of the resource. A resource with a rank equal to 1 is of the highest importance.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRank() {
        return this.rank;
    }
    /**
     * Gets the recommendationId property value. The unique identifier of the recommendation that the resource is associated with.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecommendationId() {
        return this.recommendationId;
    }
    /**
     * Gets the resourceType property value. Indicates the type of Azure AD resource. Examples include user, application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceType() {
        return this.resourceType;
    }
    /**
     * Gets the status property value. The status property
     * @return a RecommendationStatus
     */
    @javax.annotation.Nullable
    public RecommendationStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subjectId property value. The related unique identifier, depending on the resourceType. For example, this property is set to the applicationId if the resourceType is an application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectId() {
        return this.subjectId;
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
        writer.writeStringValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeStringValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("portalUrl", this.getPortalUrl());
        writer.writeOffsetDateTimeValue("postponeUntilDateTime", this.getPostponeUntilDateTime());
        writer.writeIntegerValue("rank", this.getRank());
        writer.writeStringValue("recommendationId", this.getRecommendationId());
        writer.writeStringValue("resourceType", this.getResourceType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subjectId", this.getSubjectId());
    }
    /**
     * Sets the addedDateTime property value. The date and time when the impactedResource object was initially associated with the recommendation.
     * @param value Value to set for the addedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.addedDateTime = value;
    }
    /**
     * Sets the additionalDetails property value. Additional information unique to the impactedResource to help contextualize the recommendation.
     * @param value Value to set for the additionalDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalDetails(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this.additionalDetails = value;
    }
    /**
     * Sets the apiUrl property value. The URL link to the corresponding Azure AD resource.
     * @param value Value to set for the apiUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApiUrl(@javax.annotation.Nullable final String value) {
        this.apiUrl = value;
    }
    /**
     * Sets the displayName property value. Friendly name of the Azure AD resource.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedBy property value. Name of the user or service that last updated the status.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final String value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the status was last updated.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final String value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the owner property value. The user responsible for maintaining the resource.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final String value) {
        this.owner = value;
    }
    /**
     * Sets the portalUrl property value. The URL link to the corresponding Azure AD portal page of the resource.
     * @param value Value to set for the portalUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPortalUrl(@javax.annotation.Nullable final String value) {
        this.portalUrl = value;
    }
    /**
     * Sets the postponeUntilDateTime property value. The future date and time when the status of a postponed impactedResource will be active again.
     * @param value Value to set for the postponeUntilDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostponeUntilDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.postponeUntilDateTime = value;
    }
    /**
     * Sets the rank property value. Indicates the importance of the resource. A resource with a rank equal to 1 is of the highest importance.
     * @param value Value to set for the rank property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRank(@javax.annotation.Nullable final Integer value) {
        this.rank = value;
    }
    /**
     * Sets the recommendationId property value. The unique identifier of the recommendation that the resource is associated with.
     * @param value Value to set for the recommendationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecommendationId(@javax.annotation.Nullable final String value) {
        this.recommendationId = value;
    }
    /**
     * Sets the resourceType property value. Indicates the type of Azure AD resource. Examples include user, application.
     * @param value Value to set for the resourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceType(@javax.annotation.Nullable final String value) {
        this.resourceType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final RecommendationStatus value) {
        this.status = value;
    }
    /**
     * Sets the subjectId property value. The related unique identifier, depending on the resourceType. For example, this property is set to the applicationId if the resourceType is an application.
     * @param value Value to set for the subjectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectId(@javax.annotation.Nullable final String value) {
        this.subjectId = value;
    }
}
