package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationOneRosterApiDataProvider extends EducationSynchronizationDataProvider implements Parsable {
    /** The connectionSettings property */
    private EducationSynchronizationConnectionSettings _connectionSettings;
    /** The connectionUrl property */
    private String _connectionUrl;
    /** The customizations property */
    private EducationSynchronizationCustomizations _customizations;
    /** The providerName property */
    private String _providerName;
    /** The schoolsIds property */
    private java.util.List<String> _schoolsIds;
    /** The termIds property */
    private java.util.List<String> _termIds;
    /**
     * Instantiates a new EducationOneRosterApiDataProvider and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationOneRosterApiDataProvider() {
        super();
        this.setOdataType("#microsoft.graph.educationOneRosterApiDataProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationOneRosterApiDataProvider
     */
    @javax.annotation.Nonnull
    public static EducationOneRosterApiDataProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationOneRosterApiDataProvider();
    }
    /**
     * Gets the connectionSettings property value. The connectionSettings property
     * @return a educationSynchronizationConnectionSettings
     */
    @javax.annotation.Nullable
    public EducationSynchronizationConnectionSettings getConnectionSettings() {
        return this._connectionSettings;
    }
    /**
     * Gets the connectionUrl property value. The connectionUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectionUrl() {
        return this._connectionUrl;
    }
    /**
     * Gets the customizations property value. The customizations property
     * @return a educationSynchronizationCustomizations
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomizations getCustomizations() {
        return this._customizations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectionSettings", (n) -> { this.setConnectionSettings(n.getObjectValue(EducationSynchronizationConnectionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("connectionUrl", (n) -> { this.setConnectionUrl(n.getStringValue()); });
        deserializerMap.put("customizations", (n) -> { this.setCustomizations(n.getObjectValue(EducationSynchronizationCustomizations::createFromDiscriminatorValue)); });
        deserializerMap.put("providerName", (n) -> { this.setProviderName(n.getStringValue()); });
        deserializerMap.put("schoolsIds", (n) -> { this.setSchoolsIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("termIds", (n) -> { this.setTermIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the providerName property value. The providerName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProviderName() {
        return this._providerName;
    }
    /**
     * Gets the schoolsIds property value. The schoolsIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSchoolsIds() {
        return this._schoolsIds;
    }
    /**
     * Gets the termIds property value. The termIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTermIds() {
        return this._termIds;
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
        writer.writeObjectValue("connectionSettings", this.getConnectionSettings());
        writer.writeStringValue("connectionUrl", this.getConnectionUrl());
        writer.writeObjectValue("customizations", this.getCustomizations());
        writer.writeStringValue("providerName", this.getProviderName());
        writer.writeCollectionOfPrimitiveValues("schoolsIds", this.getSchoolsIds());
        writer.writeCollectionOfPrimitiveValues("termIds", this.getTermIds());
    }
    /**
     * Sets the connectionSettings property value. The connectionSettings property
     * @param value Value to set for the connectionSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionSettings(@javax.annotation.Nullable final EducationSynchronizationConnectionSettings value) {
        this._connectionSettings = value;
    }
    /**
     * Sets the connectionUrl property value. The connectionUrl property
     * @param value Value to set for the connectionUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionUrl(@javax.annotation.Nullable final String value) {
        this._connectionUrl = value;
    }
    /**
     * Sets the customizations property value. The customizations property
     * @param value Value to set for the customizations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomizations(@javax.annotation.Nullable final EducationSynchronizationCustomizations value) {
        this._customizations = value;
    }
    /**
     * Sets the providerName property value. The providerName property
     * @param value Value to set for the providerName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProviderName(@javax.annotation.Nullable final String value) {
        this._providerName = value;
    }
    /**
     * Sets the schoolsIds property value. The schoolsIds property
     * @param value Value to set for the schoolsIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchoolsIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._schoolsIds = value;
    }
    /**
     * Sets the termIds property value. The termIds property
     * @param value Value to set for the termIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._termIds = value;
    }
}
