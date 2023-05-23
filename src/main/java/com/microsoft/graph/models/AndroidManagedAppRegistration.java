package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidManagedAppRegistration extends ManagedAppRegistration implements Parsable {
    /** The patch version for the current android app registration */
    private String patchVersion;
    /**
     * Instantiates a new AndroidManagedAppRegistration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidManagedAppRegistration() {
        super();
        this.setOdataType("#microsoft.graph.androidManagedAppRegistration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedAppRegistration
     */
    @javax.annotation.Nonnull
    public static AndroidManagedAppRegistration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedAppRegistration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("patchVersion", (n) -> { this.setPatchVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the patchVersion property value. The patch version for the current android app registration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPatchVersion() {
        return this.patchVersion;
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
        writer.writeStringValue("patchVersion", this.getPatchVersion());
    }
    /**
     * Sets the patchVersion property value. The patch version for the current android app registration
     * @param value Value to set for the patchVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPatchVersion(@javax.annotation.Nullable final String value) {
        this.patchVersion = value;
    }
}
