package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS software update state summary for a device and user
 */
public class MacOSSoftwareUpdateStateSummary extends Entity implements Parsable {
    /** Human readable name of the software update */
    private String displayName;
    /** Last date time the report for this device and product key was updated. */
    private OffsetDateTime lastUpdatedDateTime;
    /** Product key of the software update. */
    private String productKey;
    /** MacOS Software Update State */
    private MacOSSoftwareUpdateState state;
    /** MacOS Software Update Category */
    private MacOSSoftwareUpdateCategory updateCategory;
    /** Version of the software update */
    private String updateVersion;
    /**
     * Instantiates a new macOSSoftwareUpdateStateSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSSoftwareUpdateStateSummary
     */
    @javax.annotation.Nonnull
    public static MacOSSoftwareUpdateStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSoftwareUpdateStateSummary();
    }
    /**
     * Gets the displayName property value. Human readable name of the software update
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("productKey", (n) -> { this.setProductKey(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(MacOSSoftwareUpdateState.class)); });
        deserializerMap.put("updateCategory", (n) -> { this.setUpdateCategory(n.getEnumValue(MacOSSoftwareUpdateCategory.class)); });
        deserializerMap.put("updateVersion", (n) -> { this.setUpdateVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Last date time the report for this device and product key was updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the productKey property value. Product key of the software update.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductKey() {
        return this.productKey;
    }
    /**
     * Gets the state property value. MacOS Software Update State
     * @return a macOSSoftwareUpdateState
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateState getState() {
        return this.state;
    }
    /**
     * Gets the updateCategory property value. MacOS Software Update Category
     * @return a macOSSoftwareUpdateCategory
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateCategory getUpdateCategory() {
        return this.updateCategory;
    }
    /**
     * Gets the updateVersion property value. Version of the software update
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpdateVersion() {
        return this.updateVersion;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeEnumValue("state", this.getState());
        writer.writeEnumValue("updateCategory", this.getUpdateCategory());
        writer.writeStringValue("updateVersion", this.getUpdateVersion());
    }
    /**
     * Sets the displayName property value. Human readable name of the software update
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Last date time the report for this device and product key was updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the productKey property value. Product key of the software update.
     * @param value Value to set for the productKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductKey(@javax.annotation.Nullable final String value) {
        this.productKey = value;
    }
    /**
     * Sets the state property value. MacOS Software Update State
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final MacOSSoftwareUpdateState value) {
        this.state = value;
    }
    /**
     * Sets the updateCategory property value. MacOS Software Update Category
     * @param value Value to set for the updateCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateCategory(@javax.annotation.Nullable final MacOSSoftwareUpdateCategory value) {
        this.updateCategory = value;
    }
    /**
     * Sets the updateVersion property value. Version of the software update
     * @param value Value to set for the updateVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateVersion(@javax.annotation.Nullable final String value) {
        this.updateVersion = value;
    }
}
