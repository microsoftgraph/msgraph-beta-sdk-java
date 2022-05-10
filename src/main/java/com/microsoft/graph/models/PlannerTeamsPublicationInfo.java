package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerTeamsPublicationInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The date and time when this task was last modified by the publication process. Read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The identifier of the publication. Read-only. */
    private String _publicationId;
    /** The identifier of the plannerPlan this task was originally placed in. Read-only. */
    private String _publishedToPlanId;
    /** The identifier of the team that initiated the publication process. Read-only. */
    private String _publishingTeamId;
    /** The display name of the team that initiated the publication process. This display name is for reference only, and might not represent the most up-to-date name of the team. Read-only. */
    private String _publishingTeamName;
    /**
     * Instantiates a new plannerTeamsPublicationInfo and sets the default values.
     * @return a void
     */
    public PlannerTeamsPublicationInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerTeamsPublicationInfo
     */
    @javax.annotation.Nonnull
    public static PlannerTeamsPublicationInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTeamsPublicationInfo();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerTeamsPublicationInfo currentObject = this;
        return new HashMap<>(5) {{
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("publicationId", (n) -> { currentObject.setPublicationId(n.getStringValue()); });
            this.put("publishedToPlanId", (n) -> { currentObject.setPublishedToPlanId(n.getStringValue()); });
            this.put("publishingTeamId", (n) -> { currentObject.setPublishingTeamId(n.getStringValue()); });
            this.put("publishingTeamName", (n) -> { currentObject.setPublishingTeamName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when this task was last modified by the publication process. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the publicationId property value. The identifier of the publication. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublicationId() {
        return this._publicationId;
    }
    /**
     * Gets the publishedToPlanId property value. The identifier of the plannerPlan this task was originally placed in. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublishedToPlanId() {
        return this._publishedToPlanId;
    }
    /**
     * Gets the publishingTeamId property value. The identifier of the team that initiated the publication process. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublishingTeamId() {
        return this._publishingTeamId;
    }
    /**
     * Gets the publishingTeamName property value. The display name of the team that initiated the publication process. This display name is for reference only, and might not represent the most up-to-date name of the team. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublishingTeamName() {
        return this._publishingTeamName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("publicationId", this.getPublicationId());
        writer.writeStringValue("publishedToPlanId", this.getPublishedToPlanId());
        writer.writeStringValue("publishingTeamId", this.getPublishingTeamId());
        writer.writeStringValue("publishingTeamName", this.getPublishingTeamName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when this task was last modified by the publication process. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the publicationId property value. The identifier of the publication. Read-only.
     * @param value Value to set for the publicationId property.
     * @return a void
     */
    public void setPublicationId(@javax.annotation.Nullable final String value) {
        this._publicationId = value;
    }
    /**
     * Sets the publishedToPlanId property value. The identifier of the plannerPlan this task was originally placed in. Read-only.
     * @param value Value to set for the publishedToPlanId property.
     * @return a void
     */
    public void setPublishedToPlanId(@javax.annotation.Nullable final String value) {
        this._publishedToPlanId = value;
    }
    /**
     * Sets the publishingTeamId property value. The identifier of the team that initiated the publication process. Read-only.
     * @param value Value to set for the publishingTeamId property.
     * @return a void
     */
    public void setPublishingTeamId(@javax.annotation.Nullable final String value) {
        this._publishingTeamId = value;
    }
    /**
     * Sets the publishingTeamName property value. The display name of the team that initiated the publication process. This display name is for reference only, and might not represent the most up-to-date name of the team. Read-only.
     * @param value Value to set for the publishingTeamName property.
     * @return a void
     */
    public void setPublishingTeamName(@javax.annotation.Nullable final String value) {
        this._publishingTeamName = value;
    }
}
