package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A reference to folder containing apps and weblinks on the Managed Home Screen
 */
public class AndroidDeviceOwnerKioskModeManagedFolderReference extends AndroidDeviceOwnerKioskModeHomeScreenItem implements Parsable {
    /**
     * Unique identifier for the folder
     */
    private String folderIdentifier;
    /**
     * Name of the folder
     */
    private String folderName;
    /**
     * Instantiates a new androidDeviceOwnerKioskModeManagedFolderReference and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskModeManagedFolderReference() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerKioskModeManagedFolderReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidDeviceOwnerKioskModeManagedFolderReference
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerKioskModeManagedFolderReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerKioskModeManagedFolderReference();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("folderIdentifier", (n) -> { this.setFolderIdentifier(n.getStringValue()); });
        deserializerMap.put("folderName", (n) -> { this.setFolderName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the folderIdentifier property value. Unique identifier for the folder
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFolderIdentifier() {
        return this.folderIdentifier;
    }
    /**
     * Gets the folderName property value. Name of the folder
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFolderName() {
        return this.folderName;
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
        writer.writeStringValue("folderIdentifier", this.getFolderIdentifier());
        writer.writeStringValue("folderName", this.getFolderName());
    }
    /**
     * Sets the folderIdentifier property value. Unique identifier for the folder
     * @param value Value to set for the folderIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFolderIdentifier(@javax.annotation.Nullable final String value) {
        this.folderIdentifier = value;
    }
    /**
     * Sets the folderName property value. Name of the folder
     * @param value Value to set for the folderName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFolderName(@javax.annotation.Nullable final String value) {
        this.folderName = value;
    }
}
