package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SharePointRoot} and sets the default values.
     */
    public SharePointRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointRoot}
     */
    @jakarta.annotation.Nonnull
    public static SharePointRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("migrations", (n) -> { this.setMigrations(n.getObjectValue(SharePointMigrationsRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the migrations property value. The migration operations for cross-organization SharePoint migrations.
     * @return a {@link SharePointMigrationsRoot}
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationsRoot getMigrations() {
        return this.backingStore.get("migrations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("migrations", this.getMigrations());
    }
    /**
     * Sets the migrations property value. The migration operations for cross-organization SharePoint migrations.
     * @param value Value to set for the migrations property.
     */
    public void setMigrations(@jakarta.annotation.Nullable final SharePointMigrationsRoot value) {
        this.backingStore.set("migrations", value);
    }
}
