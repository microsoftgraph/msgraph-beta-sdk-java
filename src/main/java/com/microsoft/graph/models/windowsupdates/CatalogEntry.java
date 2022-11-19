package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.windowsupdates.FeatureUpdateCatalogEntry;
import com.microsoft.graph.models.windowsupdates.QualityUpdateCatalogEntry;
import com.microsoft.graph.models.windowsupdates.SoftwareUpdateCatalogEntry;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class CatalogEntry extends Entity implements Parsable {
    /** The date on which the content is no longer available to deploy using the service. Read-only. */
    private OffsetDateTime _deployableUntilDateTime;
    /** The display name of the content. Read-only. */
    private String _displayName;
    /** The release date for the content. Read-only. */
    private OffsetDateTime _releaseDateTime;
    /**
     * Instantiates a new catalogEntry and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CatalogEntry() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.catalogEntry");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a catalogEntry
     */
    @javax.annotation.Nonnull
    public static CatalogEntry createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsUpdates.featureUpdateCatalogEntry": return new FeatureUpdateCatalogEntry();
                case "#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry": return new QualityUpdateCatalogEntry();
                case "#microsoft.graph.windowsUpdates.softwareUpdateCatalogEntry": return new SoftwareUpdateCatalogEntry();
            }
        }
        return new CatalogEntry();
    }
    /**
     * Gets the deployableUntilDateTime property value. The date on which the content is no longer available to deploy using the service. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeployableUntilDateTime() {
        return this._deployableUntilDateTime;
    }
    /**
     * Gets the displayName property value. The display name of the content. Read-only.
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
        final CatalogEntry currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deployableUntilDateTime", (n) -> { currentObject.setDeployableUntilDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("releaseDateTime", (n) -> { currentObject.setReleaseDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the releaseDateTime property value. The release date for the content. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this._releaseDateTime;
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
        writer.writeOffsetDateTimeValue("deployableUntilDateTime", this.getDeployableUntilDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("releaseDateTime", this.getReleaseDateTime());
    }
    /**
     * Sets the deployableUntilDateTime property value. The date on which the content is no longer available to deploy using the service. Read-only.
     * @param value Value to set for the deployableUntilDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeployableUntilDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deployableUntilDateTime = value;
    }
    /**
     * Sets the displayName property value. The display name of the content. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the releaseDateTime property value. The release date for the content. Read-only.
     * @param value Value to set for the releaseDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReleaseDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._releaseDateTime = value;
    }
}
