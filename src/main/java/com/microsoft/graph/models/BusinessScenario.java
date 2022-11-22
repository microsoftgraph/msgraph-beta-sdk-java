package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BusinessScenario extends Entity implements Parsable {
    /** The createdBy property */
    private IdentitySet _createdBy;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The displayName property */
    private String _displayName;
    /** The lastModifiedBy property */
    private IdentitySet _lastModifiedBy;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The ownerAppIds property */
    private java.util.List<String> _ownerAppIds;
    /** The planner property */
    private BusinessScenarioPlanner _planner;
    /** The uniqueName property */
    private String _uniqueName;
    /**
     * Instantiates a new BusinessScenario and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BusinessScenario() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BusinessScenario
     */
    @javax.annotation.Nonnull
    public static BusinessScenario createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessScenario();
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ownerAppIds", (n) -> { this.setOwnerAppIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("planner", (n) -> { this.setPlanner(n.getObjectValue(BusinessScenarioPlanner::createFromDiscriminatorValue)); });
        deserializerMap.put("uniqueName", (n) -> { this.setUniqueName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
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
     * Gets the ownerAppIds property value. The ownerAppIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOwnerAppIds() {
        return this._ownerAppIds;
    }
    /**
     * Gets the planner property value. The planner property
     * @return a businessScenarioPlanner
     */
    @javax.annotation.Nullable
    public BusinessScenarioPlanner getPlanner() {
        return this._planner;
    }
    /**
     * Gets the uniqueName property value. The uniqueName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUniqueName() {
        return this._uniqueName;
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
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("ownerAppIds", this.getOwnerAppIds());
        writer.writeObjectValue("planner", this.getPlanner());
        writer.writeStringValue("uniqueName", this.getUniqueName());
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
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
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the ownerAppIds property value. The ownerAppIds property
     * @param value Value to set for the ownerAppIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerAppIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._ownerAppIds = value;
    }
    /**
     * Sets the planner property value. The planner property
     * @param value Value to set for the planner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlanner(@javax.annotation.Nullable final BusinessScenarioPlanner value) {
        this._planner = value;
    }
    /**
     * Sets the uniqueName property value. The uniqueName property
     * @param value Value to set for the uniqueName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUniqueName(@javax.annotation.Nullable final String value) {
        this._uniqueName = value;
    }
}
