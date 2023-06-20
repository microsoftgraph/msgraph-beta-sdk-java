package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppFileSystemDetection extends Win32LobAppDetection implements Parsable {
    /** A value indicating whether this file or folder is for checking 32-bit app on 64-bit system */
    private Boolean check32BitOn64System;
    /** Contains all supported file system detection type. */
    private Win32LobAppFileSystemDetectionType detectionType;
    /** The file or folder detection value */
    private String detectionValue;
    /** The file or folder name to detect Win32 Line of Business (LoB) app */
    private String fileOrFolderName;
    /** Contains properties for detection operator. */
    private Win32LobAppDetectionOperator operator;
    /** The file or folder path to detect Win32 Line of Business (LoB) app */
    private String path;
    /**
     * Instantiates a new Win32LobAppFileSystemDetection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Win32LobAppFileSystemDetection() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppFileSystemDetection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppFileSystemDetection
     */
    @javax.annotation.Nonnull
    public static Win32LobAppFileSystemDetection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppFileSystemDetection();
    }
    /**
     * Gets the check32BitOn64System property value. A value indicating whether this file or folder is for checking 32-bit app on 64-bit system
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCheck32BitOn64System() {
        return this.check32BitOn64System;
    }
    /**
     * Gets the detectionType property value. Contains all supported file system detection type.
     * @return a Win32LobAppFileSystemDetectionType
     */
    @javax.annotation.Nullable
    public Win32LobAppFileSystemDetectionType getDetectionType() {
        return this.detectionType;
    }
    /**
     * Gets the detectionValue property value. The file or folder detection value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDetectionValue() {
        return this.detectionValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("check32BitOn64System", (n) -> { this.setCheck32BitOn64System(n.getBooleanValue()); });
        deserializerMap.put("detectionType", (n) -> { this.setDetectionType(n.getEnumValue(Win32LobAppFileSystemDetectionType.class)); });
        deserializerMap.put("detectionValue", (n) -> { this.setDetectionValue(n.getStringValue()); });
        deserializerMap.put("fileOrFolderName", (n) -> { this.setFileOrFolderName(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(Win32LobAppDetectionOperator.class)); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileOrFolderName property value. The file or folder name to detect Win32 Line of Business (LoB) app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileOrFolderName() {
        return this.fileOrFolderName;
    }
    /**
     * Gets the operator property value. Contains properties for detection operator.
     * @return a Win32LobAppDetectionOperator
     */
    @javax.annotation.Nullable
    public Win32LobAppDetectionOperator getOperator() {
        return this.operator;
    }
    /**
     * Gets the path property value. The file or folder path to detect Win32 Line of Business (LoB) app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPath() {
        return this.path;
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
        writer.writeBooleanValue("check32BitOn64System", this.getCheck32BitOn64System());
        writer.writeEnumValue("detectionType", this.getDetectionType());
        writer.writeStringValue("detectionValue", this.getDetectionValue());
        writer.writeStringValue("fileOrFolderName", this.getFileOrFolderName());
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeStringValue("path", this.getPath());
    }
    /**
     * Sets the check32BitOn64System property value. A value indicating whether this file or folder is for checking 32-bit app on 64-bit system
     * @param value Value to set for the check32BitOn64System property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCheck32BitOn64System(@javax.annotation.Nullable final Boolean value) {
        this.check32BitOn64System = value;
    }
    /**
     * Sets the detectionType property value. Contains all supported file system detection type.
     * @param value Value to set for the detectionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionType(@javax.annotation.Nullable final Win32LobAppFileSystemDetectionType value) {
        this.detectionType = value;
    }
    /**
     * Sets the detectionValue property value. The file or folder detection value
     * @param value Value to set for the detectionValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionValue(@javax.annotation.Nullable final String value) {
        this.detectionValue = value;
    }
    /**
     * Sets the fileOrFolderName property value. The file or folder name to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the fileOrFolderName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileOrFolderName(@javax.annotation.Nullable final String value) {
        this.fileOrFolderName = value;
    }
    /**
     * Sets the operator property value. Contains properties for detection operator.
     * @param value Value to set for the operator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperator(@javax.annotation.Nullable final Win32LobAppDetectionOperator value) {
        this.operator = value;
    }
    /**
     * Sets the path property value. The file or folder path to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the path property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPath(@javax.annotation.Nullable final String value) {
        this.path = value;
    }
}
