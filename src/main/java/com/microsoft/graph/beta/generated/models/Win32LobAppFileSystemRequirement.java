package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains file or folder path to detect a Win32 App
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppFileSystemRequirement extends Win32LobAppRequirement implements Parsable {
    /**
     * Instantiates a new Win32LobAppFileSystemRequirement and sets the default values.
     */
    public Win32LobAppFileSystemRequirement() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppFileSystemRequirement");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppFileSystemRequirement
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppFileSystemRequirement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppFileSystemRequirement();
    }
    /**
     * Gets the check32BitOn64System property value. A value indicating whether this file or folder is for checking 32-bit app on 64-bit system
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCheck32BitOn64System() {
        return this.backingStore.get("check32BitOn64System");
    }
    /**
     * Gets the detectionType property value. Contains all supported file system detection type.
     * @return a Win32LobAppFileSystemDetectionType
     */
    @jakarta.annotation.Nullable
    public Win32LobAppFileSystemDetectionType getDetectionType() {
        return this.backingStore.get("detectionType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("check32BitOn64System", (n) -> { this.setCheck32BitOn64System(n.getBooleanValue()); });
        deserializerMap.put("detectionType", (n) -> { this.setDetectionType(n.getEnumValue(Win32LobAppFileSystemDetectionType::forValue)); });
        deserializerMap.put("fileOrFolderName", (n) -> { this.setFileOrFolderName(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileOrFolderName property value. The file or folder name to detect Win32 Line of Business (LoB) app
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileOrFolderName() {
        return this.backingStore.get("fileOrFolderName");
    }
    /**
     * Gets the path property value. The file or folder path to detect Win32 Line of Business (LoB) app
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.backingStore.get("path");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("check32BitOn64System", this.getCheck32BitOn64System());
        writer.writeEnumValue("detectionType", this.getDetectionType());
        writer.writeStringValue("fileOrFolderName", this.getFileOrFolderName());
        writer.writeStringValue("path", this.getPath());
    }
    /**
     * Sets the check32BitOn64System property value. A value indicating whether this file or folder is for checking 32-bit app on 64-bit system
     * @param value Value to set for the check32BitOn64System property.
     */
    public void setCheck32BitOn64System(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("check32BitOn64System", value);
    }
    /**
     * Sets the detectionType property value. Contains all supported file system detection type.
     * @param value Value to set for the detectionType property.
     */
    public void setDetectionType(@jakarta.annotation.Nullable final Win32LobAppFileSystemDetectionType value) {
        this.backingStore.set("detectionType", value);
    }
    /**
     * Sets the fileOrFolderName property value. The file or folder name to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the fileOrFolderName property.
     */
    public void setFileOrFolderName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileOrFolderName", value);
    }
    /**
     * Sets the path property value. The file or folder path to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("path", value);
    }
}
