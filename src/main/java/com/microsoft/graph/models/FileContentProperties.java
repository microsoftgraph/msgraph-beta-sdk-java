package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileContentProperties extends ContentProperties implements Parsable {
    /** The isVisibleOnlyToOneDriveOwner property */
    private Boolean isVisibleOnlyToOneDriveOwner;
    /**
     * Instantiates a new FileContentProperties and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FileContentProperties() {
        super();
        this.setOdataType("#microsoft.graph.fileContentProperties");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileContentProperties
     */
    @javax.annotation.Nonnull
    public static FileContentProperties createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileContentProperties();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isVisibleOnlyToOneDriveOwner", (n) -> { this.setIsVisibleOnlyToOneDriveOwner(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isVisibleOnlyToOneDriveOwner property value. The isVisibleOnlyToOneDriveOwner property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsVisibleOnlyToOneDriveOwner() {
        return this.isVisibleOnlyToOneDriveOwner;
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
        writer.writeBooleanValue("isVisibleOnlyToOneDriveOwner", this.getIsVisibleOnlyToOneDriveOwner());
    }
    /**
     * Sets the isVisibleOnlyToOneDriveOwner property value. The isVisibleOnlyToOneDriveOwner property
     * @param value Value to set for the isVisibleOnlyToOneDriveOwner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsVisibleOnlyToOneDriveOwner(@javax.annotation.Nullable final Boolean value) {
        this.isVisibleOnlyToOneDriveOwner = value;
    }
}
