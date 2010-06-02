package GGram.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		GGram.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		GGram.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		GGram.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		GGram.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		GGram.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return GGram.diagram.part.GGramDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
