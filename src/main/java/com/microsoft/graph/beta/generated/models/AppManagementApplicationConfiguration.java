package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppManagementApplicationConfiguration extends AppManagementConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AppManagementApplicationConfiguration} and sets the default values.
     */
    public AppManagementApplicationConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.appManagementApplicationConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppManagementApplicationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AppManagementApplicationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppManagementApplicationConfiguration();
    }
    /**
     * Gets the audiences property value. Property to restrict creation or update of apps based on their target signInAudience types.
     * @return a {@link AudiencesConfiguration}
     */
    @jakarta.annotation.Nullable
    public AudiencesConfiguration getAudiences() {
        return this.backingStore.get("audiences");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audiences", (n) -> { this.setAudiences(n.getObjectValue(AudiencesConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("identifierUris", (n) -> { this.setIdentifierUris(n.getObjectValue(IdentifierUriConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identifierUris property value. Configuration object for restrictions on identifierUris property for an application.
     * @return a {@link IdentifierUriConfiguration}
     */
    @jakarta.annotation.Nullable
    public IdentifierUriConfiguration getIdentifierUris() {
        return this.backingStore.get("identifierUris");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("audiences", this.getAudiences());
        writer.writeObjectValue("identifierUris", this.getIdentifierUris());
    }
    /**
     * Sets the audiences property value. Property to restrict creation or update of apps based on their target signInAudience types.
     * @param value Value to set for the audiences property.
     */
    public void setAudiences(@jakarta.annotation.Nullable final AudiencesConfiguration value) {
        this.backingStore.set("audiences", value);
    }
    /**
     * Sets the identifierUris property value. Configuration object for restrictions on identifierUris property for an application.
     * @param value Value to set for the identifierUris property.
     */
    public void setIdentifierUris(@jakarta.annotation.Nullable final IdentifierUriConfiguration value) {
        this.backingStore.set("identifierUris", value);
    }
}
