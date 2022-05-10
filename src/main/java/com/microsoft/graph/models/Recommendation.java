package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Recommendation extends Entity implements Parsable {
    /** The actionSteps property */
    private java.util.List<ActionStep> _actionSteps;
    /** The benefits property */
    private String _benefits;
    /** The category property */
    private RecommendationCategory _category;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The displayName property */
    private String _displayName;
    /** The impactedResources property */
    private java.util.List<RecommendationResource> _impactedResources;
    /** The impactStartDateTime property */
    private OffsetDateTime _impactStartDateTime;
    /** The impactType property */
    private String _impactType;
    /** The insights property */
    private String _insights;
    /** The lastCheckedDateTime property */
    private OffsetDateTime _lastCheckedDateTime;
    /** The lastModifiedBy property */
    private String _lastModifiedBy;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The postponeUntilDateTime property */
    private OffsetDateTime _postponeUntilDateTime;
    /** The priority property */
    private RecommendationPriority _priority;
    /** The status property */
    private RecommendationStatus _status;
    /**
     * Instantiates a new recommendation and sets the default values.
     * @return a void
     */
    public Recommendation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recommendation
     */
    @javax.annotation.Nonnull
    public static Recommendation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Recommendation();
    }
    /**
     * Gets the actionSteps property value. The actionSteps property
     * @return a actionStep
     */
    @javax.annotation.Nullable
    public java.util.List<ActionStep> getActionSteps() {
        return this._actionSteps;
    }
    /**
     * Gets the benefits property value. The benefits property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBenefits() {
        return this._benefits;
    }
    /**
     * Gets the category property value. The category property
     * @return a recommendationCategory
     */
    @javax.annotation.Nullable
    public RecommendationCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
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
        final Recommendation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("actionSteps", (n) -> { currentObject.setActionSteps(n.getCollectionOfObjectValues(ActionStep::createFromDiscriminatorValue)); });
            this.put("benefits", (n) -> { currentObject.setBenefits(n.getStringValue()); });
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(RecommendationCategory.class)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("impactedResources", (n) -> { currentObject.setImpactedResources(n.getCollectionOfObjectValues(RecommendationResource::createFromDiscriminatorValue)); });
            this.put("impactStartDateTime", (n) -> { currentObject.setImpactStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("impactType", (n) -> { currentObject.setImpactType(n.getStringValue()); });
            this.put("insights", (n) -> { currentObject.setInsights(n.getStringValue()); });
            this.put("lastCheckedDateTime", (n) -> { currentObject.setLastCheckedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("postponeUntilDateTime", (n) -> { currentObject.setPostponeUntilDateTime(n.getOffsetDateTimeValue()); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getEnumValue(RecommendationPriority.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(RecommendationStatus.class)); });
        }};
    }
    /**
     * Gets the impactedResources property value. The impactedResources property
     * @return a recommendationResource
     */
    @javax.annotation.Nullable
    public java.util.List<RecommendationResource> getImpactedResources() {
        return this._impactedResources;
    }
    /**
     * Gets the impactStartDateTime property value. The impactStartDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getImpactStartDateTime() {
        return this._impactStartDateTime;
    }
    /**
     * Gets the impactType property value. The impactType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImpactType() {
        return this._impactType;
    }
    /**
     * Gets the insights property value. The insights property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInsights() {
        return this._insights;
    }
    /**
     * Gets the lastCheckedDateTime property value. The lastCheckedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCheckedDateTime() {
        return this._lastCheckedDateTime;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the postponeUntilDateTime property value. The postponeUntilDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPostponeUntilDateTime() {
        return this._postponeUntilDateTime;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a recommendationPriority
     */
    @javax.annotation.Nullable
    public RecommendationPriority getPriority() {
        return this._priority;
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actionSteps", this.getActionSteps());
        writer.writeStringValue("benefits", this.getBenefits());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("impactedResources", this.getImpactedResources());
        writer.writeOffsetDateTimeValue("impactStartDateTime", this.getImpactStartDateTime());
        writer.writeStringValue("impactType", this.getImpactType());
        writer.writeStringValue("insights", this.getInsights());
        writer.writeOffsetDateTimeValue("lastCheckedDateTime", this.getLastCheckedDateTime());
        writer.writeStringValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("postponeUntilDateTime", this.getPostponeUntilDateTime());
        writer.writeEnumValue("priority", this.getPriority());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the actionSteps property value. The actionSteps property
     * @param value Value to set for the actionSteps property.
     * @return a void
     */
    public void setActionSteps(@javax.annotation.Nullable final java.util.List<ActionStep> value) {
        this._actionSteps = value;
    }
    /**
     * Sets the benefits property value. The benefits property
     * @param value Value to set for the benefits property.
     * @return a void
     */
    public void setBenefits(@javax.annotation.Nullable final String value) {
        this._benefits = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final RecommendationCategory value) {
        this._category = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the impactedResources property value. The impactedResources property
     * @param value Value to set for the impactedResources property.
     * @return a void
     */
    public void setImpactedResources(@javax.annotation.Nullable final java.util.List<RecommendationResource> value) {
        this._impactedResources = value;
    }
    /**
     * Sets the impactStartDateTime property value. The impactStartDateTime property
     * @param value Value to set for the impactStartDateTime property.
     * @return a void
     */
    public void setImpactStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._impactStartDateTime = value;
    }
    /**
     * Sets the impactType property value. The impactType property
     * @param value Value to set for the impactType property.
     * @return a void
     */
    public void setImpactType(@javax.annotation.Nullable final String value) {
        this._impactType = value;
    }
    /**
     * Sets the insights property value. The insights property
     * @param value Value to set for the insights property.
     * @return a void
     */
    public void setInsights(@javax.annotation.Nullable final String value) {
        this._insights = value;
    }
    /**
     * Sets the lastCheckedDateTime property value. The lastCheckedDateTime property
     * @param value Value to set for the lastCheckedDateTime property.
     * @return a void
     */
    public void setLastCheckedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastCheckedDateTime = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final String value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the postponeUntilDateTime property value. The postponeUntilDateTime property
     * @param value Value to set for the postponeUntilDateTime property.
     * @return a void
     */
    public void setPostponeUntilDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._postponeUntilDateTime = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final RecommendationPriority value) {
        this._priority = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final RecommendationStatus value) {
        this._status = value;
    }
}
