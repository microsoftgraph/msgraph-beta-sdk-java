package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTeamsPublicationInfo extends PlannerTaskCreation implements Parsable {
    /**
     * The date and time when this task was last modified by the publication process. Read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The identifier of the publication. Read-only.
     */
    private String publicationId;
    /**
     * The identifier of the plannerPlan this task was originally placed in. Read-only.
     */
    private String publishedToPlanId;
    /**
     * The identifier of the team that initiated the publication process. Read-only.
     */
    private String publishingTeamId;
    /**
     * The display name of the team that initiated the publication process. This display name is for reference only, and might not represent the most up-to-date name of the team. Read-only.
     */
    private String publishingTeamName;
    /**
     * Instantiates a new PlannerTeamsPublicationInfo and sets the default values.
     */
    public PlannerTeamsPublicationInfo() {
        super();
        this.setOdataType("#microsoft.graph.plannerTeamsPublicationInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerTeamsPublicationInfo
     */
    @jakarta.annotation.Nonnull
    public static PlannerTeamsPublicationInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTeamsPublicationInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("publicationId", (n) -> { this.setPublicationId(n.getStringValue()); });
        deserializerMap.put("publishedToPlanId", (n) -> { this.setPublishedToPlanId(n.getStringValue()); });
        deserializerMap.put("publishingTeamId", (n) -> { this.setPublishingTeamId(n.getStringValue()); });
        deserializerMap.put("publishingTeamName", (n) -> { this.setPublishingTeamName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when this task was last modified by the publication process. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the publicationId property value. The identifier of the publication. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublicationId() {
        return this.publicationId;
    }
    /**
     * Gets the publishedToPlanId property value. The identifier of the plannerPlan this task was originally placed in. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublishedToPlanId() {
        return this.publishedToPlanId;
    }
    /**
     * Gets the publishingTeamId property value. The identifier of the team that initiated the publication process. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublishingTeamId() {
        return this.publishingTeamId;
    }
    /**
     * Gets the publishingTeamName property value. The display name of the team that initiated the publication process. This display name is for reference only, and might not represent the most up-to-date name of the team. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublishingTeamName() {
        return this.publishingTeamName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("publicationId", this.getPublicationId());
        writer.writeStringValue("publishedToPlanId", this.getPublishedToPlanId());
        writer.writeStringValue("publishingTeamId", this.getPublishingTeamId());
        writer.writeStringValue("publishingTeamName", this.getPublishingTeamName());
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when this task was last modified by the publication process. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the publicationId property value. The identifier of the publication. Read-only.
     * @param value Value to set for the publicationId property.
     */
    public void setPublicationId(@jakarta.annotation.Nullable final String value) {
        this.publicationId = value;
    }
    /**
     * Sets the publishedToPlanId property value. The identifier of the plannerPlan this task was originally placed in. Read-only.
     * @param value Value to set for the publishedToPlanId property.
     */
    public void setPublishedToPlanId(@jakarta.annotation.Nullable final String value) {
        this.publishedToPlanId = value;
    }
    /**
     * Sets the publishingTeamId property value. The identifier of the team that initiated the publication process. Read-only.
     * @param value Value to set for the publishingTeamId property.
     */
    public void setPublishingTeamId(@jakarta.annotation.Nullable final String value) {
        this.publishingTeamId = value;
    }
    /**
     * Sets the publishingTeamName property value. The display name of the team that initiated the publication process. This display name is for reference only, and might not represent the most up-to-date name of the team. Read-only.
     * @param value Value to set for the publishingTeamName property.
     */
    public void setPublishingTeamName(@jakarta.annotation.Nullable final String value) {
        this.publishingTeamName = value;
    }
}
