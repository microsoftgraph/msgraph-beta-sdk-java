package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.CustomCalloutExtension;
import com.microsoft.graph.models.CustomExtensionCallbackConfiguration;
import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomTaskExtension extends CustomCalloutExtension implements Parsable {
    /** The callback configuration for a custom extension. */
    private CustomExtensionCallbackConfiguration _callbackConfiguration;
    /** The unique identifier of the Azure AD user that created the custom task extension. */
    private User _createdBy;
    /** When the custom task extension was created. */
    private OffsetDateTime _createdDateTime;
    /** The unique identifier of the Azure AD user that modified the custom task extension last. */
    private User _lastModifiedBy;
    /** When the custom extension was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /**
     * Instantiates a new CustomTaskExtension and sets the default values.
     * @return a void
     */
    public CustomTaskExtension() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.customTaskExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomTaskExtension
     */
    @javax.annotation.Nonnull
    public static CustomTaskExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTaskExtension();
    }
    /**
     * Gets the callbackConfiguration property value. The callback configuration for a custom extension.
     * @return a customExtensionCallbackConfiguration
     */
    @javax.annotation.Nullable
    public CustomExtensionCallbackConfiguration getCallbackConfiguration() {
        return this._callbackConfiguration;
    }
    /**
     * Gets the createdBy property value. The unique identifier of the Azure AD user that created the custom task extension.
     * @return a user
     */
    @javax.annotation.Nullable
    public User getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. When the custom task extension was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CustomTaskExtension currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("callbackConfiguration", (n) -> { currentObject.setCallbackConfiguration(n.getObjectValue(CustomExtensionCallbackConfiguration::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the lastModifiedBy property value. The unique identifier of the Azure AD user that modified the custom task extension last.
     * @return a user
     */
    @javax.annotation.Nullable
    public User getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. When the custom extension was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("callbackConfiguration", this.getCallbackConfiguration());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the callbackConfiguration property value. The callback configuration for a custom extension.
     * @param value Value to set for the callbackConfiguration property.
     * @return a void
     */
    public void setCallbackConfiguration(@javax.annotation.Nullable final CustomExtensionCallbackConfiguration value) {
        this._callbackConfiguration = value;
    }
    /**
     * Sets the createdBy property value. The unique identifier of the Azure AD user that created the custom task extension.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final User value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. When the custom task extension was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the lastModifiedBy property value. The unique identifier of the Azure AD user that modified the custom task extension last.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final User value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. When the custom extension was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
}
